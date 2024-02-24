package com.ceduk.streming.controllers;

import com.ceduk.streming.entities.CatTipo;
import com.ceduk.streming.service.CatTipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CatTipoController {

    @Autowired
    private CatTipoService service;

    @GetMapping("/tipos")
    public List<CatTipo> getTipoAll(){
        return service.getTiposAll();
    }

    @GetMapping("/tipos/{id}")
    public Optional<CatTipo> getTipoById(@PathVariable Integer id) {
        return service.getTipoById(id);
    }

    @PostMapping("/tipos/")
    public CatTipo postTipo(@RequestBody CatTipo tipo){
        return service.postTipo(tipo);
    }

    @DeleteMapping("/tipos/{id}")
    public String deleteTipoById(@PathVariable Integer id) {
        service.deleteTipoById(id);
        return "El registro se ha eliminado correctamente";
    }

    @PutMapping("/tipos/")
    public CatTipo putTipo(@RequestBody CatTipo tipo) {
        return  service.putTipo(tipo);
    }
}
