package com.ceduk.streming.Repositories;

import com.ceduk.streming.Entities.CatTipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatTiposRepository extends JpaRepository<CatTipos, Integer> {
}
