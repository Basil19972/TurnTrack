package com.example.jwt.domain.weekDay.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.trainingDayDate.TrainingDayDate;
import com.example.jwt.domain.trainingDayDate.dto.TrainingDayDateDTO;
import com.example.jwt.domain.trainingSet.TrainingSet;
import com.example.jwt.domain.trainingSet.dto.TrainingSetDTO;

import javax.persistence.Column;
import java.util.Date;
import java.util.Set;


public class WeekDayDTO extends ExtendedDTO {

    private String dayPlanname;

    private String dayName;

    private Set<ExerciseDTO> exercises;







    public WeekDayDTO(String dayPlanname, String dayName, Set<ExerciseDTO> exercises) {
        this.dayPlanname = dayPlanname;
        this.dayName = dayName;
        this.exercises = exercises;
    }

    public WeekDayDTO() {
    }

    public String getDayPlanname() {
        return dayPlanname;
    }

    public void setDayPlanname(String dayPlanname) {
        this.dayPlanname = dayPlanname;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public Set<ExerciseDTO> getExercises() {
        return exercises;
    }

    public void setExercises(Set<ExerciseDTO> exercises) {
        this.exercises = exercises;
    }
}
