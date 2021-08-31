package com.gallego.dreamhome.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="STAFF")
public class StaffEntity {

    @Id
    @Column(name="STAFFNO")
    private String staffNo;

    @Column(name="FNAME")
    private String firstName;

    @Column(name="LNAME")
    private String lastName;

    @Column(name="POSITION")
    private String position;

    @Column(name="SEX")
    private String sex;

    @Column(name="DOB")
    private Date DOB;

    @Column(name="SALARY")
    private String salary;

    @ManyToOne
    @JoinColumn(name="BRANCHNO", referencedColumnName = "BRANCHNO", updatable = false )
    private BranchEntity branchEntity;
}
