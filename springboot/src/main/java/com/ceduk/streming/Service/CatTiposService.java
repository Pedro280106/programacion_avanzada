package com.ceduk.streming.Service;

import com.ceduk.streming.DTO.CatTiposDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CatTiposService {
    public List<CatTiposDTO> getCatTipos();
}
