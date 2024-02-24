package com.ceduk.streming.service.impl;

import com.ceduk.streming.entities.CatGenero;
import com.ceduk.streming.repositories.CatGeneroRepository;
import com.ceduk.streming.service.CatGeneroService;
import com.ceduk.streming.util.ValidarCampos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatGeneroServoceImpl implements CatGeneroService {

    @Autowired
    private CatGeneroRepository repository;

    @Autowired
    private ValidarCampos validarCampos;

    @Override
    public List<CatGenero> getGenerosAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CatGenero> getGeneroById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CatGenero postGenero(CatGenero genero) {
        return repository.save(genero);
    }

    @Override
    public void deleteGeneroById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public CatGenero putGenero(CatGenero genero) {
        Optional<CatGenero> optionalCatGenero = getGeneroById(genero.getIduGenero());

        if (optionalCatGenero.isPresent()) {
            CatGenero catGenero = optionalCatGenero.get();
            catGenero.setNomGenero(catGenero.getNomGenero());
            return repository.save(catGenero);
        }
        return null;
    }
}
