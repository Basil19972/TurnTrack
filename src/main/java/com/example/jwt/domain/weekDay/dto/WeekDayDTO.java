package com.example.jwt.domain.weekDay.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.excercise.dto.ExerciseDTO;

import java.util.Date;
import java.util.Set;


public class WeekDayDTO extends ExtendedDTO {

    private String name;

    private Date trainingDayDate;

    private Set<ExerciseDTO> exercises;



    public WeekDayDTO(String name, Set<ExerciseDTO> exercises, Date trainingDayDate) {
        this.name = name;
        this.exercises = exercises;
        this.trainingDayDate = trainingDayDate;
    }

    public WeekDayDTO() {
    }

    public Date getTrainingDayDate() {
        return trainingDayDate;
    }

    public void setTrainingDayDate(Date trainingDayDate) {
        this.trainingDayDate = trainingDayDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ExerciseDTO> getExercises() {
        return exercises;
    }

    public void setExercises(Set<ExerciseDTO> exercises) {
        this.exercises = exercises;
    }
}
