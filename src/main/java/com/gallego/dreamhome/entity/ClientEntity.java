package com.gallego.dreamhome.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="CLIENT")
public class ClientEntity {
    @Id
    @Column(name="CLIENTNO")
    private String clientNo;

    @Column(name="FNAME")
    private String firstName;

    @Column(name="LNAME")
    private String lastName;

    @Column(name="TELNO")
    private String telNo;

    @Column(name="PREFTYPE")
    private String preferenceType;

    @Column(name="MAXRENT")
    private int rentMaxima;
}
