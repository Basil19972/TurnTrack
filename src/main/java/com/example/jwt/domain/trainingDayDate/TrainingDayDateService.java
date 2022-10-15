package com.example.jwt.domain.trainingDayDate;

import com.example.jwt.core.generic.ExtendedService;

import java.util.Date;

public interface TrainingDayDateService extends ExtendedService<TrainingDayDate> {

    TrainingDayDate findTrainingDateDate(Date date);



}
