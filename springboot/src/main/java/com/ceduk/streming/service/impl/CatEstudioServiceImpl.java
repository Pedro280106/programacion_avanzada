package com.ceduk.streming.service.impl;

import com.ceduk.streming.entities.CatEstudio;
import com.ceduk.streming.repositories.CatEstudioRepository;
import com.ceduk.streming.service.CatEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatEstudioServiceImpl implements CatEstudioService {

    @Autowired
    private CatEstudioRepository repository;

    @Override
    public List<CatEstudio> getEstudiosAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CatEstudio> getEstudioById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CatEstudio postEstudio(CatEstudio estudio) {
        return repository.save(estudio);
    }

    @Override
    public void deleteEstudioById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public CatEstudio putEstudio(CatEstudio estudio) {
        Optional<CatEstudio> optionalCatEstudio = getEstudioById(estudio.getIduEstudio());

        if (optionalCatEstudio.isPresent()) {
            CatEstudio catEstudio = optionalCatEstudio.get();
            catEstudio.setNomEstudio(catEstudio.getNomEstudio());
            return  repository.save(catEstudio);
        }
        return null;
    }
}
