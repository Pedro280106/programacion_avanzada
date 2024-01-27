package com.ceduk.streming.Mappers;

import com.ceduk.streming.DTO.CatEstudiosDTO;
import com.ceduk.streming.Entities.CatEstudios;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CatEstudiosMapper {
    CatEstudiosMapper INSTANCE = Mappers.getMapper(CatEstudiosMapper.class);

    @Mapping(target = "iduEstudio", source = "iduEstudio")
    @Mapping(target = "nombre", source = "nombre")
    CatEstudiosDTO entityToDto(CatEstudios entity);

    @Mapping(target = "iduEstudio", source = "iduEstudio")
    @Mapping(target = "nombre", source = "nombre")
    List<CatEstudiosDTO> listEntityToDto(List<CatEstudios> listEntity);
}
