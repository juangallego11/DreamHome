package com.gallego.dreamhome.service.impl;

import com.gallego.dreamhome.dto.StaffDto;
import com.gallego.dreamhome.entity.StaffEntity;
import com.gallego.dreamhome.repository.StaffRepository;
import com.gallego.dreamhome.service.StaffService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<StaffDto> findAll() {
        Iterable<StaffEntity> resultEntity = this.repository.findAll();
        List<StaffDto> listStaff = new ArrayList<>();
        while (resultEntity.iterator().hasNext()){
            for(StaffEntity s: resultEntity){
                listStaff.add(modelMapper.map(s,StaffDto.class));
            }
            return listStaff;
        }
        return listStaff;
    }
}
