package com.example.graphQl.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

/**
 * @author Sudan
 *
 **/

@Entity
@Data
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PHONE_NO")
    private String phoneNo;

    @Column(name = "ADDRESS")
    private String address;

    @JoinColumn(name = "DESIGNATION", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.EAGER)
    private Designation designation;
}
