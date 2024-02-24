package com.ceduk.streming.repositories;

import com.ceduk.streming.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CtlMultimediaRepository extends JpaRepository<CtlMultimedia, Integer> {

    List<CtlMultimedia> findAllByIduGeneroIduGenero(Integer iduGenero);

    List<CtlMultimedia> findAllByIduClasificacionIduClasificacion(Integer iduClasificacion);

    List<CtlMultimedia> findAllByIduEstudioIduEstudio(Integer iduEstudio);

    List<CtlMultimedia> findAllByIduContenidoIduContenido(Integer iduContenido);
}
