package com.iot.iot.business.abstracts;


import java.util.List;

import com.iot.iot.business.dto.requestDto.CreateFieldRequest;
import com.iot.iot.business.dto.requestDto.UpdateFieldRequest;
import com.iot.iot.business.dto.responseDto.GetAllFieldResponse;

public interface IFieldService {

    List<GetAllFieldResponse> getAll();
    void add (CreateFieldRequest createFieldRequest);
    void update(UpdateFieldRequest updateFieldRequest);
    void delete (int id);
}
