package com.gallego.dreamhome.dto;

import lombok.Data;

import java.util.Date;

@Data
public class StaffDto {
    private String staffNo;
    private String firstName;
    private String lastName;
    private String position;
    private String sex;
    private Date DOB;
    private String salary;
    private String branchNo;

}
