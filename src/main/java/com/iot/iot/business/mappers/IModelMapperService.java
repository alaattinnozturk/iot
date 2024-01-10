package com.iot.iot.business.mappers;

import org.modelmapper.ModelMapper;

public interface IModelMapperService {
    
    ModelMapper forResponse();
    ModelMapper forRequest();
}
