package com.gallego.dreamhome.dto;

import lombok.Data;

@Data
public class ClientDto {
    private String clientNo;
    private String firstName;
    private String lastName;
    private String telNo;
    private String preferenceType;
    private int rentMaxima;
}
