package com.example.crud.repository;

import com.example.crud.entity.FirstSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FirstScheduleRepository extends JpaRepository<FirstSchedule, Long> {

    Boolean existsFirstScheduleByPart(String partName);
    FirstSchedule findByPart(String partName);
}
