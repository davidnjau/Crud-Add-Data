package com.example.crud.service.impl;

import com.example.crud.entity.ScheduleData;
import com.example.crud.repository.FirstSecondScheduleRepository;
import com.example.crud.service.FirstSecondScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FirstSecondSecondScheduleServiceImpl implements FirstSecondScheduleService {

    @Autowired
    private FirstSecondScheduleRepository firstSecondScheduleRepository;

    @Override
    public ScheduleData saveSchedule(ScheduleData scheduleData) {

        String partName = scheduleData.getPart();
        Boolean isPartName = firstSecondScheduleRepository.existsFirstScheduleByPart(partName);
        if (isPartName){

            ScheduleData scheduleData1 = firstSecondScheduleRepository.findByPart(partName);
            Long id = scheduleData1.getId();
            Optional<ScheduleData> scheduleData2 = updatePartData(scheduleData, id);
            return scheduleData2.orElse(null);

        }else {
            return firstSecondScheduleRepository.save(scheduleData);

        }

    }

    private Optional<ScheduleData> updatePartData(ScheduleData scheduleData, Long id) {

        return firstSecondScheduleRepository.findById(id)
                .map(scheduleDataOld -> {

                    scheduleDataOld.setPart(scheduleData.getPart());
                    scheduleDataOld.setContent(scheduleDataOld.getContent());
                    return firstSecondScheduleRepository.save(scheduleDataOld);

                });

    }


}
