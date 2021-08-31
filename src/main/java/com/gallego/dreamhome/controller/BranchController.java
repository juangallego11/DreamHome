package com.gallego.dreamhome.controller;

import com.gallego.dreamhome.dto.BranchDto;
import com.gallego.dreamhome.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<BranchDto> findAll(){
        return branchService.findAll();
    }
}
