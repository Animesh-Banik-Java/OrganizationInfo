package com.organization.info.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long salary;
    private Date dateOfJoin;
    @ManyToOne
    @JoinColumn
    private Department department;

}
