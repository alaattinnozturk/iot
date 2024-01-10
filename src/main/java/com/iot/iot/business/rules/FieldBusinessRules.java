package com.iot.iot.business.rules;

import org.springframework.stereotype.Service;

import com.iot.iot.business.exception.BusinessException;
import com.iot.iot.dataAccess.abstracts.IFieldRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FieldBusinessRules {
        private IFieldRepository fieldRepository;

    public void checkIfFieldNameExists(String name){
        if(this.fieldRepository.existsByName(name)){
            throw new BusinessException("Field name already exists"); //Java Exception types
        }
    }
}
