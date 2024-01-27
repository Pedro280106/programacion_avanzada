package com.ceduk.streming.Controller;

import com.ceduk.streming.DTO.CatEstudiosDTO;
import com.ceduk.streming.Service.CatEstudiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estudios")
public class CatEstudiosController {

    @Autowired
    private CatEstudiosService service;

    @GetMapping(value = "/")
    public ResponseEntity<List<CatEstudiosDTO>> getCatEstudios(){
        return ResponseEntity.ok(service.obtenerEstudios());
    }

}
