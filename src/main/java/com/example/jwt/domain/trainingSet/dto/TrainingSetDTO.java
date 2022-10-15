package com.example.jwt.domain.trainingSet.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.excercise.dto.ExerciseDTO;


public class TrainingSetDTO extends ExtendedDTO {

    private int weight;

    private int repetitions;

    private ExerciseDTO exercise;

    public TrainingSetDTO(int weight, int repetitions, ExerciseDTO exercise) {
        this.weight = weight;
        this.repetitions = repetitions;
        this.exercise = exercise;
    }

    public TrainingSetDTO() {
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
