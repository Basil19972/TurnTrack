package com.example.jwt.domain.excercise.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.day.Day;
import com.example.jwt.domain.excercise.Excercise;
import com.example.jwt.domain.planCategory.PlanCategory;
import com.example.jwt.domain.trainingSet.TrainingSet;
import com.example.jwt.domain.trainingSet.dto.TrainingSetDTO;
import lombok.Data;

import java.util.Set;

public class ExerciseDTO extends ExtendedDTO {

    private String name;

    private Set<TrainingSetDTO> trainingSets;

    public ExerciseDTO(String name, Set<TrainingSetDTO> trainingSets) {
        this.name = name;
        this.trainingSets = trainingSets;
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
}
