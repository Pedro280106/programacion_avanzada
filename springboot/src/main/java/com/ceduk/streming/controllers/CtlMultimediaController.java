package com.ceduk.streming.controllers;

import com.ceduk.streming.entities.CtlMultimedia;
import com.ceduk.streming.service.CtlMultimediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/multimedias/")
public class CtlMultimediaController {

    @Autowired
    private CtlMultimediaService service;

    @GetMapping
    public List<CtlMultimedia> consultarMultimedia(){
        return service.getMultimediasAll();
    }

    @GetMapping("{id}")
    public Optional<CtlMultimedia> consultarById(@PathVariable Integer id){
        return service.getMultimediaById(id);
    }

    @GetMapping("genero/{genero}")
    public List<CtlMultimedia> consultarByGenero(@PathVariable Integer genero){
        return service.getAllMultimediaByGenero(genero);
    }

    @GetMapping("clasificacion/{clasificacion}")
    public List<CtlMultimedia> consultarByClasificacion(@PathVariable Integer clasificacion){
        return service.getAllMultimediaByClasificacion(clasificacion);
    }

    @GetMapping("estudio/{estudio}")
    public List<CtlMultimedia> consultarByEstudio(@PathVariable Integer estudio){
        return service.getAllMultimediaByEstudio(estudio);
    }

    @GetMapping("contenido/{contenido}")
    public List<CtlMultimedia> consultarByContenido(@PathVariable Integer contenido){
        return service.getAllMultimediaByContenido(contenido);
    }

    @PutMapping
    public CtlMultimedia actualizarMultimedia(@RequestBody CtlMultimedia multimedia){
        return service.putMultimedia(multimedia);
    }

    @PostMapping
    public CtlMultimedia registrarMultimedia(@RequestBody CtlMultimedia multimedia){
        return service.postMultimedia(multimedia);
    }

    @DeleteMapping("{id}")
    public String eliminarMultimediaById(@PathVariable Integer id){
        service.deleteMultimediaById(id);
        return "El registro ha sido eliminado exitosamente";
    }
}
