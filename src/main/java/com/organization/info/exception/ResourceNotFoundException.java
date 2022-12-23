package com.organization.info.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ResourceNotFoundException extends RuntimeException{
    String resourceName;
    public ResourceNotFoundException( String resourceName) {
        super(String.format("%s Not found. Please try again..!!", resourceName));
        this.resourceName = resourceName;
    }
}
