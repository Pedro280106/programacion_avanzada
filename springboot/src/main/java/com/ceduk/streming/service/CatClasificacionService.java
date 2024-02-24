package com.ceduk.streming.service;

import com.ceduk.streming.entities.CatClasificacion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CatClasificacionService {

    List<CatClasificacion> getClasificacionesAll();

    Optional<CatClasificacion> getClasificacionById(Integer id);

    CatClasificacion postClasificacion(CatClasificacion clasificacion);

    void deleteClasificacionById(Integer id);

    List<CatClasificacion> getAllClasificacionByTipo(Integer id);

    CatClasificacion putClasificacion(CatClasificacion clasificacion);
}
