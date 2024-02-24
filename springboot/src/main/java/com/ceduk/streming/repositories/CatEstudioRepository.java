package com.ceduk.streming.repositories;

import com.ceduk.streming.entities.CatEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CatEstudioRepository extends JpaRepository<CatEstudio, Integer> {
}
