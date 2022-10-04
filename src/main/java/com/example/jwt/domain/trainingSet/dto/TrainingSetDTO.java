package com.example.jwt.domain.trainingSet.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.trainingSet.TrainingSet;
import lombok.Data;

import javax.persistence.Column;
import java.util.Set;


public class TrainingSetDTO extends ExtendedDTO {

    private int weight;

    private int repetitions;

    public TrainingSetDTO(int weight, int repetitions) {
        this.weight = weight;
        this.repetitions = repetitions;
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
}
