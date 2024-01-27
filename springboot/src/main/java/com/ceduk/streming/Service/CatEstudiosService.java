package com.ceduk.streming.Service;

import com.ceduk.streming.DTO.CatEstudiosDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CatEstudiosService {
    public List<CatEstudiosDTO> obtenerEstudios();
}
