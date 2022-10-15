package com.example.jwt.domain.trainingDayDate.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.planCategory.dto.PlanCategoryDTO;
import com.example.jwt.domain.weekDay.WeekDay;
import com.example.jwt.domain.weekDay.dto.WeekDayDTO;

import java.util.Date;
import java.util.Set;

public class TrainingDayDateDTO extends ExtendedDTO {

    private Date date;

    public TrainingDayDateDTO(Date date) {
        this.date = date;
    }

    public TrainingDayDateDTO() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
