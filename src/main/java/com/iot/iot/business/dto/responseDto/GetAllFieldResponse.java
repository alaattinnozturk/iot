package com.iot.iot.business.dto.responseDto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllFieldResponse {
    
    private int id;

   
    private String name;

   
    private LocalDateTime date;

    
    private boolean isCheck;
}
