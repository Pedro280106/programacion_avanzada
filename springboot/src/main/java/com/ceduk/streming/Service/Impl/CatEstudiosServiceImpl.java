package com.ceduk.streming.Service.Impl;

import com.ceduk.streming.DTO.CatEstudiosDTO;
import com.ceduk.streming.Mappers.CatEstudiosMapper;
import com.ceduk.streming.Repositories.CatEstudiosRepository;
import com.ceduk.streming.Service.CatEstudiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatEstudiosServiceImpl implements CatEstudiosService {

    @Autowired
    private CatEstudiosMapper mapper;

    @Autowired
    private CatEstudiosRepository repository;

    @Override
    public List<CatEstudiosDTO> obtenerEstudios() {
        return mapper.INSTANCE.listEntityToDto(repository.findAll());
    }
}
