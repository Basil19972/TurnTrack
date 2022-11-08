package com.example.jwt.domain.trainingSet.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.weekDay.dto.WeekDayDTO;

import java.util.Set;


public class TrainingSetDTO extends ExtendedDTO {

    private int weight;
    private int repetitions;
    private Set<WeekDayDTO> weekDays;
    private ExerciseDTO exercise;




    public TrainingSetDTO(int weight, int repetitions, Set<WeekDayDTO> weekDays, ExerciseDTO exercise) {
        this.weight = weight;
        this.repetitions = repetitions;
        this.weekDays = weekDays;
        this.exercise = exercise;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public Set<WeekDayDTO> getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(Set<WeekDayDTO> weekDays) {
        this.weekDays = weekDays;
    }

    public ExerciseDTO getExercise() {
        return exercise;
    }

    public void setExercise(ExerciseDTO exercise) {
        this.exercise = exercise;
    }
}





