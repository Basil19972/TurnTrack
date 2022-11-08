package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.trainingSet.dto.DoExerciseTrainingsSetDTO;
import com.example.jwt.domain.trainingSet.dto.StatDateRepWeightExname;
import com.example.jwt.domain.trainingSet.dto.TrainingSetDTO;
import com.example.jwt.domain.weekDay.WeekDay;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface TrainingSetService extends ExtendedService<TrainingSet> {



    List<TrainingSet> findAllTrainingsSetFromCurrentUser();

    List<StatDateRepWeightExname> getAllWeightRepsFromLastMonth();

    List<DoExerciseTrainingsSetDTO> findAllTrainingsSetToDoExercises();

    List<TrainingSet> createNewWorkout(List<TrainingSet> trainingSet);







    }
