package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.weekDay.WeekDay;

import javax.persistence.SecondaryTable;
import java.util.Set;
import java.util.UUID;

public interface TrainingSetService extends ExtendedService<TrainingSet> {

    Set<TrainingSet> createDefaultTrainingSet(WeekDay weekday, int amountOffSets,Exercise exercise);

    TrainingSet UpdateTrainingSetByID(UUID id, TrainingSet trainingSet);





}
