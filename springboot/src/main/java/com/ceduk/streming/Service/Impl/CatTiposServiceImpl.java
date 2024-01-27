package com.ceduk.streming.Service.Impl;

import com.ceduk.streming.DTO.CatTiposDTO;
import com.ceduk.streming.Mappers.CatTiposMapper;
import com.ceduk.streming.Repositories.CatTiposRepository;
import com.ceduk.streming.Service.CatTiposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatTiposServiceImpl implements CatTiposService {

    @Autowired
    private CatTiposMapper mapper;

    @Autowired
    private CatTiposRepository repository;

    @Override
    public List<CatTiposDTO> getCatTipos() {
        return mapper.INSTANCE.listEntityToDto(repository.findAll());
    }
}
