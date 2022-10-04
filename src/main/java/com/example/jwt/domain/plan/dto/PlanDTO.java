package com.example.jwt.domain.plan.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.day.dto.DayDTO;
import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.planCategory.dto.PlanCategoryDTO;

import java.util.Set;

public class PlanDTO extends ExtendedDTO {

    private String name;

    private DayDTO day;

    private Set<ExerciseDTO> exercises;

    private PlanCategoryDTO planCategory;

    public PlanDTO(String name, DayDTO day, Set<ExerciseDTO> exercises, PlanCategoryDTO planCategory) {
        this.name = name;
        this.day = day;
        this.exercises = exercises;
        this.planCategory = planCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DayDTO getDay() {
        return day;
    }

    public void setDay(DayDTO day) {
        this.day = day;
    }

    public Set<ExerciseDTO> getExercises() {
        return exercises;
    }

    public void setExercises(Set<ExerciseDTO> exercises) {
        this.exercises = exercises;
    }

    public PlanCategoryDTO getPlanCategory() {
        return planCategory;
    }

    public void setPlanCategory(PlanCategoryDTO planCategory) {
        this.planCategory = planCategory;
    }
}
