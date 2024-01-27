package com.ceduk.streming.Repositories;

import com.ceduk.streming.Entities.CatEstudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatEstudiosRepository extends JpaRepository<CatEstudios, Integer> {
}
