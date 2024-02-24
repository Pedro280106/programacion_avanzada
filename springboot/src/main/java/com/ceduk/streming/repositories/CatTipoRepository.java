package com.ceduk.streming.repositories;

import com.ceduk.streming.entities.CatTipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CatTipoRepository extends JpaRepository<CatTipo, Integer> {
}
