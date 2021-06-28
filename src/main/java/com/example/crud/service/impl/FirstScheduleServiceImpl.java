package com.example.crud.service.impl;

import com.example.crud.entity.FirstSchedule;
import com.example.crud.repository.FirstScheduleRepository;
import com.example.crud.service.FirstScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstScheduleServiceImpl implements FirstScheduleService {

    @Autowired
    private FirstScheduleRepository firstScheduleRepository;

    @Override
    public FirstSchedule saveSchedule(FirstSchedule firstSchedule) {

        String partName = firstSchedule.getPart();
        Boolean isPartName = firstScheduleRepository.existsFirstScheduleByPart(partName);
        if (isPartName){

            FirstSchedule firstSchedule1 = firstScheduleRepository.findByPart(partName);
            Long id = firstSchedule1.getId();


            updatePartData(firstSchedule,id);

        }else {
            firstScheduleRepository.save(firstSchedule);

        }

        return null;
    }

    private FirstSchedule updatePartData(FirstSchedule firstSchedule, Long id) {

        return firstScheduleRepository.findById(id)
                .map(firstScheduleOld -> {

                    firstScheduleOld.setPart(firstSchedule.getPart());
                    firstScheduleOld.setContent(firstScheduleOld.getContent());
                    return firstScheduleRepository.save(firstScheduleOld);

                }).orElse(null);

    }


}
