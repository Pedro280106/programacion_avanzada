package com.ceduk.streming.service.impl;

import com.ceduk.streming.entities.CtlMultimedia;
import com.ceduk.streming.repositories.CtlMultimediaRepository;
import com.ceduk.streming.service.CtlMultimediaService;
import com.ceduk.streming.util.ValidarCampos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CtlMultimediaServiceImpl implements CtlMultimediaService {

    @Autowired
    private CtlMultimediaRepository repository;

    @Autowired
    private ValidarCampos validarCampos;

    @Override
    public List<CtlMultimedia> getMultimediasAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CtlMultimedia> getMultimediaById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<CtlMultimedia> getAllMultimediaByGenero(Integer id) {
        return repository.findAllByIduGeneroIduGenero(id);
    }

    @Override
    public List<CtlMultimedia> getAllMultimediaByClasificacion(Integer id) {
        return repository.findAllByIduClasificacionIduClasificacion(id);
    }

    @Override
    public List<CtlMultimedia> getAllMultimediaByEstudio(Integer id) {
        return repository.findAllByIduEstudioIduEstudio(id);
    }

    @Override
    public List<CtlMultimedia> getAllMultimediaByContenido(Integer id) {
        return repository.findAllByIduContenidoIduContenido(id);
    }

    @Override
    public CtlMultimedia putMultimedia(CtlMultimedia multimedia) {
        Optional<CtlMultimedia> optionalCtlMultimedia = getMultimediaById(multimedia.getIduMultimedia());

        if (optionalCtlMultimedia.isPresent()) {
            CtlMultimedia ctlMultimedia = validarCampos.actualizar(optionalCtlMultimedia.get(), multimedia);
            return repository.save(ctlMultimedia);
        }
        return null;
    }

    @Override
    public CtlMultimedia postMultimedia(CtlMultimedia multimedia) {
        return repository.save(multimedia);
    }

    @Override
    public void deleteMultimediaById(Integer id) {
        repository.deleteById(id);
    }
}
