package com.ceduk.streming.service.impl;

import com.ceduk.streming.entities.CatClasificacion;
import com.ceduk.streming.repositories.CatClasificacionRepository;
import com.ceduk.streming.service.CatClasificacionService;
import com.ceduk.streming.util.ValidarCampos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatClasificacionServiceImpl implements CatClasificacionService {

    @Autowired
    private CatClasificacionRepository repository;

    @Autowired
    private ValidarCampos validarCampos;

    @Override
    public List<CatClasificacion> getClasificacionesAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CatClasificacion> getClasificacionById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CatClasificacion postClasificacion(CatClasificacion clasificacion) {
        return repository.save(clasificacion);
    }

    @Override
    public void deleteClasificacionById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<CatClasificacion> getAllClasificacionByTipo(Integer id) {
        return repository.findAllByTipoIduTipo(id);
    }

    @Override
    public CatClasificacion putClasificacion(CatClasificacion clasificacion) {
        Optional<CatClasificacion> optionalCatClasificacion = getClasificacionById(clasificacion.getIduClasificacion());

        if (optionalCatClasificacion.isPresent()) {
            CatClasificacion catClasificacion = validarCampos.actualizar(optionalCatClasificacion.get(), clasificacion);
            return repository.save(catClasificacion);
        }
        return null;
    }
}
