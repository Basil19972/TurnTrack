package com.example.jwt.domain.planCategory;

import com.example.jwt.core.generic.ExtendedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PlanCategory")
public class PlanCategory extends ExtendedEntity {

    private String name;

    public PlanCategory(String name) {
        this.name = name;
    }

    public PlanCategory() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
