package com.ceduk.streming.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CatEstudiosDTO {
    private int iduEstudio;
    private String nombre;
}
