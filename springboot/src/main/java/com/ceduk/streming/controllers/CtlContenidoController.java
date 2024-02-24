package com.ceduk.streming.controllers;

import com.ceduk.streming.entities.CtlContenido;
import com.ceduk.streming.service.CtlContenidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contenidos/")
public class CtlContenidoController {

    @Autowired
    private CtlContenidoService service;

    @GetMapping
    public List<CtlContenido> consultarContenido(){
        return service.getContenidosAll();
    }

    @GetMapping("id/{id}")
    public Optional<CtlContenido> consultarById(@PathVariable Integer id){
        return service.getContenidoById(id);
    }

    @GetMapping("feclanzamiento/{fecha}")
    public List<CtlContenido> consultarByFechaLanzamiento(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha){
        return service.getAllByFechaLanzamiento(fecha);
    }

    @PutMapping
    public CtlContenido actualizarContenido(@RequestBody CtlContenido contenido){
        return service.putContenido(contenido);
    }

    @PostMapping
    public CtlContenido registrarContenido(@RequestBody CtlContenido contenido){
        return service.postContenido(contenido);
    }

    @DeleteMapping("/{id}")
    public String eliminarById(@PathVariable Integer id){
        service.deleteByContenido(id);
        return "El registro se ha eliminado correctamente";
    }
}
