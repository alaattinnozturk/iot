package com.iot.iot.business.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateFieldRequest {
    private int id;
    private String name;
    private boolean isCheck;

}
