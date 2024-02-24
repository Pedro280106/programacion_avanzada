package com.ceduk.streming.service;

import com.ceduk.streming.entities.CatEstudio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CatEstudioService {
    List<CatEstudio> getEstudiosAll();

    Optional<CatEstudio> getEstudioById(Integer id);

    CatEstudio postEstudio(CatEstudio estudio);

    void deleteEstudioById(Integer id);

    CatEstudio putEstudio(CatEstudio estudio);
}
