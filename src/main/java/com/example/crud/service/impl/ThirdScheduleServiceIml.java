package com.example.crud.service.impl;

import com.example.crud.entity.ThirdScheduleData;
import com.example.crud.repository.ThirdScheduleRepository;
import com.example.crud.service.ThirdScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThirdScheduleServiceIml implements ThirdScheduleService {

    @Autowired
    private ThirdScheduleRepository thirdScheduleService;

    @Override
    public ThirdScheduleData save(ThirdScheduleData thirdScheduleData) {
        return thirdScheduleService.save(thirdScheduleData);
    }
}
