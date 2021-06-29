package com.example.crud.repository;

import com.example.crud.entity.ScheduleData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstSecondScheduleRepository extends JpaRepository<ScheduleData, Long> {

    Boolean existsFirstScheduleByPart(String partName);
    ScheduleData findByPart(String partName);
}
