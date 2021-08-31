package com.gallego.dreamhome.service;

import com.gallego.dreamhome.dto.ClientDto;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<ClientDto> findAll();

    ClientDto findById(String clientNro);

}
