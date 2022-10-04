package com.example.jwt.domain.plan.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.day.dto.DayDTO;
import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.planCategory.dto.PlanCategoryDTO;

import java.util.Set;

public class PlanDTO extends ExtendedDTO {

    private String name;

    private DayDTO dayDTO;

    private Set<ExerciseDTO> exerciseDTOS;

    private PlanCategoryDTO planCategoryDTO;

    public PlanDTO(String name, DayDTO dayDTO, Set<ExerciseDTO> exerciseDTOS, PlanCategoryDTO planCategoryDTO) {
        this.name = name;
        this.dayDTO = dayDTO;
        this.exerciseDTOS = exerciseDTOS;
        this.planCategoryDTO = planCategoryDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DayDTO getDayDTO() {
        return dayDTO;
    }

    public void setDayDTO(DayDTO dayDTO) {
        this.dayDTO = dayDTO;
    }

    public Set<ExerciseDTO> getExerciseDTOS() {
        return exerciseDTOS;
    }

    public void setExerciseDTOS(Set<ExerciseDTO> exerciseDTOS) {
        this.exerciseDTOS = exerciseDTOS;
    }

    public PlanCategoryDTO getPlanCategoryDTO() {
        return planCategoryDTO;
    }

    public void setPlanCategoryDTO(PlanCategoryDTO planCategoryDTO) {
        this.planCategoryDTO = planCategoryDTO;
    }
}
