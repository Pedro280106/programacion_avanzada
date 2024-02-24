package com.ceduk.streming.repositories;

import com.ceduk.streming.entities.CtlContenido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDate;
import java.util.List;

@RepositoryRestResource
public interface CtlContenidoRepository extends JpaRepository<CtlContenido, Integer> {
    List<CtlContenido> findByFecLanzamiento(LocalDate fechaLanzamiento);
}
