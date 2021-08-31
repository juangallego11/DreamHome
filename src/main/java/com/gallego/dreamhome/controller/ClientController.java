package com.gallego.dreamhome.controller;

import com.gallego.dreamhome.dto.ClientDto;
import com.gallego.dreamhome.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ClientDto> findAll(){
        return clientService.findAll();
    }

    @GetMapping("/find-client/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ClientDto findById(@PathVariable("id") String clientNro){
        return clientService.findById(clientNro);
    }
}
