package com.ceduk.streming.controllers;

import com.ceduk.streming.entities.CatClasificacion;
import com.ceduk.streming.service.CatClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clasificaciones")
public class CatClasificacionController {

    @Autowired
    private CatClasificacionService service;

    @GetMapping("/")
    public List<CatClasificacion> getClasificacionesAll(){
        return service.getClasificacionesAll();
    }

    @GetMapping("/id/{id}")
    public Optional<CatClasificacion> getClasificacionById(@PathVariable Integer id) {
        return service.getClasificacionById(id);
    }

    @GetMapping("/tipo/{tipo}")
    public List<CatClasificacion> getAllClasificacionByTipo(@PathVariable Integer tipo){
        return service.getAllClasificacionByTipo(tipo);
    }

    @PutMapping("/")
    public CatClasificacion putClasificacion(@RequestBody CatClasificacion clasificacion){
        return service.putClasificacion(clasificacion);
    }

    @PostMapping("/")
    public CatClasificacion postClasificacion(@RequestBody CatClasificacion clasificacion){
        return service.postClasificacion(clasificacion);
    }

    @DeleteMapping("/{id}")
    public String deleteClasificacionById(@PathVariable Integer id) {
        service.deleteClasificacionById(id);
        return "El registro se ha eliminado correctamente";
    }
}
