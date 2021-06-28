package com.example.crud.service;

import com.example.crud.classes.SuccessPartData;
import com.example.crud.classes.SuccessPartHeading;
import com.example.crud.entity.PartData;
import com.example.crud.entity.PartTitle;
import com.example.crud.repository.PartDataRepository;
import com.example.crud.repository.PartTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartDataService {

    @Autowired
    private PartDataRepository repository;

    @Autowired
    private PartTitleRepository titleRepository;

    public PartData saveProduct(PartData partData) {
        return repository.save(partData);
    }

    public SuccessPartHeading getPartHeading(){

        SuccessPartHeading successPartHeading = new SuccessPartHeading();
        successPartHeading.setResults(titleRepository.findAll());
        return successPartHeading;
    }

    public List<PartData> getPartData(){
        return repository.findAll();
    }

    public SuccessPartData getPartData1(){

        SuccessPartData successPartData = new SuccessPartData();
        successPartData.setResults(repository.findAll());

        return successPartData;
    }


}
