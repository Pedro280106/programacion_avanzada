package com.ceduk.streming.service;

import com.ceduk.streming.entities.CtlContenido;
import com.ceduk.streming.entities.CtlMultimedia;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CtlMultimediaService {

    List<CtlMultimedia> getMultimediasAll();

    Optional<CtlMultimedia> getMultimediaById(Integer id);

    List<CtlMultimedia> getAllMultimediaByGenero(Integer id);

    List<CtlMultimedia> getAllMultimediaByClasificacion(Integer id);

    List<CtlMultimedia> getAllMultimediaByEstudio(Integer id);

    List<CtlMultimedia> getAllMultimediaByContenido(Integer id);

    CtlMultimedia putMultimedia(CtlMultimedia multimedia);

    CtlMultimedia postMultimedia(CtlMultimedia multimedia);

    void deleteMultimediaById(Integer id);
}
