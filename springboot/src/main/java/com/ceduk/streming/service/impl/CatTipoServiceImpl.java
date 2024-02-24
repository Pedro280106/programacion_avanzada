package com.ceduk.streming.service.impl;

import com.ceduk.streming.entities.CatTipo;
import com.ceduk.streming.repositories.CatTipoRepository;
import com.ceduk.streming.service.CatTipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatTipoServiceImpl implements CatTipoService {

    @Autowired
    private CatTipoRepository repository;

    @Override
    public List<CatTipo> getTiposAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CatTipo> getTipoById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CatTipo postTipo(CatTipo tipo) {
        return repository.save(tipo);
    }

    @Override
    public void deleteTipoById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public CatTipo putTipo(CatTipo tipo) {
        Optional<CatTipo> optionalCatTipo = getTipoById(tipo.getIduTipo());

        if (optionalCatTipo.isPresent()) {
            CatTipo catTipo = optionalCatTipo.get();
            catTipo.setDesTipo(catTipo.getDesTipo());
            return repository.save(catTipo);
        }
        return null;
    }
}
