package com.organization.info.dto;

import java.util.Date;
   
import lombok.Data;

@Data
public class EmployeeDTO {
    private String name;
    private Long salary;
    private Date dateOfJoin; 
    private DepartmentDTO departmentDTO;

}
