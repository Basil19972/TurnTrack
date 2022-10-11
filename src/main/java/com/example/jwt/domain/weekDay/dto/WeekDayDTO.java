package com.example.jwt.domain.weekDay.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.excercise.Exercise;

import java.util.Set;


public class WeekDayDTO extends ExtendedDTO {

    private String name;

    private Set<Exercise> exercises;


    public WeekDayDTO(String name, Set<Exercise> exercises) {
        this.name = name;
        this.exercises = exercises;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<Exercise> exercises) {
        this.exercises = exercises;
    }
}
