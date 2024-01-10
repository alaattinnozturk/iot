package com.iot.iot.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.iot.iot.business.abstracts.IFieldService;
import com.iot.iot.business.dto.requestDto.CreateFieldRequest;
import com.iot.iot.business.dto.requestDto.UpdateFieldRequest;
import com.iot.iot.business.dto.responseDto.GetAllFieldResponse;
import com.iot.iot.business.mappers.ModelMapperService;
import com.iot.iot.business.rules.FieldBusinessRules;
import com.iot.iot.dataAccess.abstracts.IFieldRepository;
import com.iot.iot.entities.Field;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class FieldService implements IFieldService{

    private IFieldRepository fieldRepository;
    private ModelMapperService modelMapperService;
    private FieldBusinessRules fieldBusinessRules;

    @Override
    public void add(CreateFieldRequest createFieldRequest) {
        this.fieldBusinessRules.checkIfFieldNameExists(createFieldRequest.getName());
        Field field = this.modelMapperService.forRequest().map(createFieldRequest, Field.class);
        this.fieldRepository.save(field);

    }

    @Override
    public List<GetAllFieldResponse> getAll(){
        List<Field> fields = fieldRepository.findAll();
        List<GetAllFieldResponse> getAllFieldResponses = fields.stream()
        .map(field -> this.modelMapperService.forResponse()
        .map(field, GetAllFieldResponse.class)).collect(Collectors.toList());

        return getAllFieldResponses;
    }

    @Override
    public void update (UpdateFieldRequest updateFieldRequest){
        Field field = this.modelMapperService.forRequest().map(updateFieldRequest, Field.class);
        this.fieldRepository.save(field);
    }

    @Override
    public void delete(int id){
        this.fieldRepository.deleteById(id);
    }

    
}
