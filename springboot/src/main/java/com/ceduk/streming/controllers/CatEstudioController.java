package com.ceduk.streming.controllers;

import com.ceduk.streming.entities.CatEstudio;
import com.ceduk.streming.service.CatEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudios/")
public class CatEstudioController {

    @Autowired
    private CatEstudioService service;

    @GetMapping
    public List<CatEstudio> getEstudiosAll(){
        return service.getEstudiosAll();
    }

    @GetMapping("{id}")
    public Optional<CatEstudio> getEstudioById(@PathVariable Integer id) {
        return service.getEstudioById(id);
    }

    @PostMapping
    public CatEstudio postEstudio(@RequestBody CatEstudio estudio){
        return service.postEstudio(estudio);
    }

    @DeleteMapping("{id}")
    public String deleteEstudioById(@PathVariable Integer id) {
        service.deleteEstudioById(id);
        return "El registro se ha eliminado correctamente";
    }

    @PutMapping
    public CatEstudio putEstudio(@RequestBody CatEstudio estudio){
        return service.putEstudio(estudio);
    }
}
