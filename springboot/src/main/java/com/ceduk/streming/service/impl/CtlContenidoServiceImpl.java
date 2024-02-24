package com.ceduk.streming.service.impl;

import com.ceduk.streming.entities.CtlContenido;
import com.ceduk.streming.repositories.CtlContenidoRepository;
import com.ceduk.streming.service.CtlContenidoService;
import com.ceduk.streming.util.ValidarCampos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CtlContenidoServiceImpl implements CtlContenidoService {

    @Autowired
    private CtlContenidoRepository repository;

    @Autowired
    private ValidarCampos validarCampos;

    @Override
    public List<CtlContenido> getContenidosAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CtlContenido> getContenidoById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<CtlContenido> getAllByFechaLanzamiento(LocalDate fecLanzamiento) {
        return repository.findByFecLanzamiento(fecLanzamiento);
    }

    @Override
    public CtlContenido putContenido(CtlContenido contenido) {
        Optional<CtlContenido> optionalCtlContenido = getContenidoById(contenido.getIduContenido());
        if (optionalCtlContenido.isPresent()){
            CtlContenido ctlContenido = validarCampos.actualizar(optionalCtlContenido.get(), contenido);
            return repository.save(ctlContenido);
        }
        return null;
    }

    @Override
    public CtlContenido postContenido(CtlContenido contenido) {
        return repository.save(contenido);
    }

    @Override
    public void deleteByContenido(Integer id) {
        repository.deleteById(id);
    }
}
