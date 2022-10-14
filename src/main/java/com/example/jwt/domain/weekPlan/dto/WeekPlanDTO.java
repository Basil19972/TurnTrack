package com.example.jwt.domain.weekPlan.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.weekDay.WeekDay;
import com.example.jwt.domain.weekDay.dto.WeekDayDTO;
import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.planCategory.dto.PlanCategoryDTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Set;

public class WeekPlanDTO extends ExtendedDTO {


    private String name;

    private WeekDay weekDay;

    public WeekPlanDTO(String name, WeekDay weekDay) {
        this.name = name;
        this.weekDay = weekDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }
}
