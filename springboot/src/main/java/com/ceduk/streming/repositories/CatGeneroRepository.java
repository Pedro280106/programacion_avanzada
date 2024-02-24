package com.ceduk.streming.repositories;

import com.ceduk.streming.entities.CatGenero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CatGeneroRepository extends JpaRepository <CatGenero, Integer>{
}
