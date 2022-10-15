package com.example.jwt.domain.excercise.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.trainingSet.dto.TrainingSetDTO;

import java.util.Set;

public class ExerciseDTO extends ExtendedDTO {

    private String name;

    private int amountOfSets;


    public ExerciseDTO(String name, int amountOfSets) {
        this.name = name;
        this.amountOfSets = amountOfSets;
    }

    public ExerciseDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfSets() {
        return amountOfSets;
    }

    public void setAmountOfSets(int amountOfSets) {
        this.amountOfSets = amountOfSets;
    }
}
