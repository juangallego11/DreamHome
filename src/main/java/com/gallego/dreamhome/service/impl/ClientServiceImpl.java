package com.gallego.dreamhome.service.impl;

import com.gallego.dreamhome.dto.ClientDto;
import com.gallego.dreamhome.entity.ClientEntity;
import com.gallego.dreamhome.repository.ClientRepository;
import com.gallego.dreamhome.service.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ClientDto> findAll() {
        Iterable<ClientEntity> resultEntity = this.clientRepository.findAll();
        List<ClientDto> listClient = new ArrayList<>();
        while (resultEntity.iterator().hasNext()){
            for(ClientEntity c: resultEntity){
                listClient.add(modelMapper.map(c,ClientDto.class));
            }
            return listClient;
        }
        return listClient;
    }

    @Override
    public ClientDto findById(String clientNro) {
        Optional<ClientEntity> resultEntity = this.clientRepository.findById(clientNro);
        ClientEntity clientEntity = resultEntity.get();
        return modelMapper.map(clientEntity,ClientDto.class);
    }

}
