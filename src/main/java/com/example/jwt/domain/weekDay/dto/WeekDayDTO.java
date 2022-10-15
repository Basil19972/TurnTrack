package com.example.jwt.domain.weekDay.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.trainingDayDate.TrainingDayDate;
import com.example.jwt.domain.trainingDayDate.dto.TrainingDayDateDTO;
import com.example.jwt.domain.trainingSet.TrainingSet;
import com.example.jwt.domain.trainingSet.dto.TrainingSetDTO;

import java.util.Date;
import java.util.Set;


public class WeekDayDTO extends ExtendedDTO {

    private String name;

    private Set<TrainingSetDTO> trainingSets;

    private Set<TrainingDayDateDTO> trainingDayDates;

    private Set<ExerciseDTO> exercises;



    public WeekDayDTO(String name, Set<TrainingSetDTO> trainingSets, Set<TrainingDayDateDTO> trainingDayDates, Set<ExerciseDTO> exercises) {
        this.name = name;
        this.trainingSets = trainingSets;
        this.trainingDayDates = trainingDayDates;
        this.exercises = exercises;
    }

    public WeekDayDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TrainingSetDTO> getTrainingSets() {
        return trainingSets;
    }

    public void setTrainingSets(Set<TrainingSetDTO> trainingSets) {
        this.trainingSets = trainingSets;
    }

    public Set<TrainingDayDateDTO> getTrainingDayDates() {
        return trainingDayDates;
    }

    public void setTrainingDayDates(Set<TrainingDayDateDTO> trainingDayDates) {
        this.trainingDayDates = trainingDayDates;
    }

    public Set<ExerciseDTO> getExercises() {
        return exercises;
    }

    public void setExercises(Set<ExerciseDTO> exercises) {
        this.exercises = exercises;
    }
}
