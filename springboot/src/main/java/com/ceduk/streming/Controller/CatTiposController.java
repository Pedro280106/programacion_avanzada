package com.ceduk.streming.Controller;

import com.ceduk.streming.DTO.ApiResponseDTO;
import com.ceduk.streming.DTO.CatTiposDTO;
import com.ceduk.streming.Service.CatTiposService;
import com.ceduk.streming.util.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/tipos")
public class CatTiposController {

    @Autowired
    private CatTiposService service;

    private final Meta meta = new Meta(UUID.randomUUID().toString(),"OK", 200);

    @GetMapping(value = "/")
    public ApiResponseDTO getCatTipos() {
        return new ApiResponseDTO(meta, service.getCatTipos());
    }
}
