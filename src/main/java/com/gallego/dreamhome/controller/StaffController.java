package com.gallego.dreamhome.controller;

import com.gallego.dreamhome.dto.StaffDto;
import com.gallego.dreamhome.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StaffDto> findAll(){
        return staffService.findAll();
    }
}
