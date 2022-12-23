package com.organization.info.request;

import java.util.Date;
   
import lombok.Data;

@Data
public class EmployeeRequest {
    private String name;
    private Long salary;
    private Date dateOfJoin; 
    private DepartmentRequest departmentRequest;

}
