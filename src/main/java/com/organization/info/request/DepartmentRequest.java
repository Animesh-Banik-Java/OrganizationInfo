package com.organization.info.request;

import lombok.Data;

@Data
public class DepartmentRequest {
    
    private String name;  
    private OrganizationRequest organizationRequest;
}
