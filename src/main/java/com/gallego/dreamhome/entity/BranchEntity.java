package com.gallego.dreamhome.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="BRANCH")
public class BranchEntity {

    @Id
    @Column(name="BRANCHNO")
    private String branchNo;

    @Column(name="STREET")
    private String street;

    @Column(name="CITY")
    private String city;

    @Column(name="POSTCODE")
    private String postCode;

}
