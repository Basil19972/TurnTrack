package com.example.jwt.domain.monthPlan.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.weekDay.dto.WeekDayDTO;
import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.planCategory.dto.PlanCategoryDTO;

import java.util.Set;

public class MonthPlanDTO extends ExtendedDTO {

    private String name;

    private WeekDayDTO day;

    private Set<ExerciseDTO> exercises;

    private PlanCategoryDTO planCategory;

    public MonthPlanDTO(String name, WeekDayDTO day, Set<ExerciseDTO> exercises, PlanCategoryDTO planCategory) {
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

    public WeekDayDTO getDay() {
        return day;
    }

    public void setDay(WeekDayDTO day) {
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
