package com.example.jwt.domain.trainingSet.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.weekDay.dto.WeekDayDTO;


public class TrainingSetDTO extends ExtendedDTO {

    private int weight;
    private int repetitions;
    private WeekDayDTO weekDay;
    private ExerciseDTO exercise;


    public TrainingSetDTO(int weight, int repetitions, WeekDayDTO weekDay, ExerciseDTO exercise) {
        this.weight = weight;
        this.repetitions = repetitions;
        this.weekDay = weekDay;
        this.exercise = exercise;
    }

    public TrainingSetDTO() {
    }

    public WeekDayDTO getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDayDTO weekDay) {
        this.weekDay = weekDay;
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

    public ExerciseDTO getExercise() {
        return exercise;
    }

    public void setExercise(ExerciseDTO exercise) {
        this.exercise = exercise;
    }
}
