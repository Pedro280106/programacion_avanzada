package com.ceduk.streming.service;

import com.ceduk.streming.entities.CtlContenido;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public interface CtlContenidoService {

    List<CtlContenido> getContenidosAll();

    Optional<CtlContenido> getContenidoById(Integer id);

    List<CtlContenido> getAllByFechaLanzamiento(LocalDate fecLanzamiento);

    CtlContenido putContenido(CtlContenido contenido);

    CtlContenido postContenido(CtlContenido contenido);

    void deleteByContenido(Integer id);
}
