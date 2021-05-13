package com.example.crud.service;

import com.example.crud.entity.PartData;
import com.example.crud.repository.PartDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartDataService {

    @Autowired
    private PartDataRepository repository;

    public PartData saveProduct(PartData partData) {
        return repository.save(partData);
    }

    public List<PartData> getPartData(){
        return repository.findAll();
    }



}
