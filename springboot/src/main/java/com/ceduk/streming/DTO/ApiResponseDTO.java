package com.ceduk.streming.DTO;

import com.ceduk.streming.util.Meta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponseDTO {
    private Meta meta;
    private Object data;
}
