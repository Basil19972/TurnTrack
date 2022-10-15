package com.example.jwt.domain.trainingDayDate;

import com.example.jwt.core.generic.ExtendedRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface TrainingDayDateRepository extends ExtendedRepository<TrainingDayDate> {

    TrainingDayDate findByDate(Date date);

}