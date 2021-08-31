package com.gallego.dreamhome.service.impl;


import com.gallego.dreamhome.dto.BranchDto;
import com.gallego.dreamhome.entity.BranchEntity;
import com.gallego.dreamhome.repository.BranchRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BranchService implements com.gallego.dreamhome.service.BranchService {

    @Autowired
    private BranchRepository branchRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<BranchDto> findAll(){
        Iterable<BranchEntity> resultEntity = this.branchRepository.findAll();
        List<BranchDto> listBranch = new ArrayList<>();
        while (resultEntity.iterator().hasNext()){
            for(BranchEntity b: resultEntity){
                listBranch.add(modelMapper.map(b,BranchDto.class));
            }
            return listBranch;
        }
        return listBranch;
    }
}
