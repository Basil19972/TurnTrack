package com.example.jwt.domain.planCategory.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.core.generic.ExtendedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

public class PlanCategoryDTO extends ExtendedDTO {

    private String name;

    public PlanCategoryDTO(String name) {
        this.name = name;
    }

    public PlanCategoryDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
