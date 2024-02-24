package com.ceduk.streming.controllers;

import com.ceduk.streming.entities.CatClasificacion;
import com.ceduk.streming.entities.CatGenero;
import com.ceduk.streming.service.CatGeneroService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CatGeneroController {

    @Autowired
    private CatGeneroService service;

    @GetMapping("/generos")
    public List<CatGenero> getCatGenero(){
        return service.getGenerosAll();
    }

    @GetMapping("/generos/{id}")
    public Optional<CatGenero> getGeneroById(@PathVariable Integer id) {
        return service.getGeneroById(id);
    }

    @PutMapping("/generos/")
    public CatGenero putGenero(@RequestBody CatGenero genero){
        return service.postGenero(genero);
    }

    @PostMapping("/generos/")
    public CatGenero postGenero(@RequestBody CatGenero genero) {
        return service.postGenero(genero);
    }

    @DeleteMapping("/generos/{id}")
    public String deleteGeneroById(@PathVariable Integer id) {
        service.deleteGeneroById(id);
        return "El registro se ha eliminado correctamente";
    }
}
