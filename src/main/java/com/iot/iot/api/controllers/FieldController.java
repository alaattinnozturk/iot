package com.iot.iot.api.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iot.iot.business.abstracts.IFieldService;
import com.iot.iot.business.dto.requestDto.CreateFieldRequest;
import com.iot.iot.business.dto.requestDto.UpdateFieldRequest;
import com.iot.iot.business.dto.responseDto.GetAllFieldResponse;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/field")
@AllArgsConstructor
public class FieldController {
    

    private IFieldService fieldService;

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add (@RequestBody CreateFieldRequest createFieldRequest){
        this.fieldService.add(createFieldRequest);
    }

    @GetMapping("/getAll")
    public List<GetAllFieldResponse> getAll() {
        return this.fieldService.getAll();
    }

    @PutMapping("/update")
    public void update (@RequestBody UpdateFieldRequest updateFieldRequest){
        this.fieldService.update(updateFieldRequest);
    }

    @DeleteMapping("/delete")
    public void delete (int id){
        this.fieldService.delete(id);
    }    
}
