package com.ceduk.streming.service;

import com.ceduk.streming.entities.CatGenero;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CatGeneroService {
    List<CatGenero> getGenerosAll();

    Optional<CatGenero> getGeneroById(Integer id);

    CatGenero postGenero(CatGenero genero);

    void deleteGeneroById(Integer id);

    CatGenero putGenero(CatGenero tipo);
}
