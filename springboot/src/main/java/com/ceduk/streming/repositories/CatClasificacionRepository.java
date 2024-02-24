package com.ceduk.streming.repositories;

import com.ceduk.streming.entities.CatClasificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CatClasificacionRepository extends JpaRepository<CatClasificacion, Integer> {

    List<CatClasificacion> findAllByTipoIduTipo(Integer iduTipo);
}
