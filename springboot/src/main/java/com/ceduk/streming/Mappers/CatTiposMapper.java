package com.ceduk.streming.Mappers;

import com.ceduk.streming.DTO.CatTiposDTO;
import com.ceduk.streming.Entities.CatTipos;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CatTiposMapper {
    CatTiposMapper INSTANCE = Mappers.getMapper(CatTiposMapper.class);

    @Mapping(target = "iduTipo", source = "iduTipo")
    @Mapping(target = "descripcion", source = "descripcion")
    CatTiposDTO entityToDto(CatTipos entity);

    @Mapping(target = "iduTipo", source = "iduTipo")
    @Mapping(target = "descripcion", source = "descripcion")
    List<CatTiposDTO> listEntityToDto(List<CatTipos> entities);
}
