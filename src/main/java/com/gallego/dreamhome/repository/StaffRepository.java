package com.gallego.dreamhome.repository;

import com.gallego.dreamhome.entity.StaffEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends CrudRepository<StaffEntity,String> {

}
