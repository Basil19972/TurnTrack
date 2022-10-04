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

    private Set<TrainingSetDTO> trainingSetDTOS;


    public ExerciseDTO(String name, Set<TrainingSetDTO> trainingSetDTOS) {
        this.name = name;
        this.trainingSetDTOS = trainingSetDTOS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TrainingSetDTO> getTrainingSetDTOS() {
        return trainingSetDTOS;
    }

    public void setTrainingSetDTOS(Set<TrainingSetDTO> trainingSetDTOS) {
        this.trainingSetDTOS = trainingSetDTOS;
    }
}
