package com.example.jwt.domain.planCategory.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.trainingSet.dto.TrainingSetDTO;
import lombok.Data;

import java.util.Set;

public class PlanCategoryDTO extends ExtendedDTO {

    private String name;

    public PlanCategoryDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlanCategoryDTO() {
    }
}
