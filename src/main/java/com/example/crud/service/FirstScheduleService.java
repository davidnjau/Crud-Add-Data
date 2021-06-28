package com.example.crud.service;

import com.example.crud.entity.FirstSchedule;
import com.example.crud.repository.FirstScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface FirstScheduleService  {

    FirstSchedule saveSchedule(FirstSchedule firstSchedule);


}
