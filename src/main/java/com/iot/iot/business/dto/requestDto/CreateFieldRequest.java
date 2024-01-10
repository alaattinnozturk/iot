package com.iot.iot.business.dto.requestDto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateFieldRequest {

    private String name;
    private boolean isCheck = false ;
    
}
