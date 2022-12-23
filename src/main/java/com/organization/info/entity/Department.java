package com.organization.info.entity;
 
 
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; 
    @ManyToOne
    @JoinColumn 
    private Organization organization;
}
