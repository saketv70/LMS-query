package com.lms.query.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends  RuntimeException{

    public ResourceNotFoundException(String resource, String fieldName, Integer fieldValue){
        super(String.format("%s not found for %s - %s ", resource, fieldName, fieldValue));
    }

}
