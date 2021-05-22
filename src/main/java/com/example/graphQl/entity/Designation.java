package com.example.graphQl.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Sudan
 *
 **/

@Entity
@Data
@Table(name = "DESIGNATION")
public class Designation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "SALARY")
    private String salary;
}
