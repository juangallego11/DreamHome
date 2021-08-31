package com.gallego.dreamhome.repository;

import com.gallego.dreamhome.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity,String> {

}
