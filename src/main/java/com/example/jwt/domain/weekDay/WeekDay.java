package com.example.jwt.domain.weekDay;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.core.generic.ExtendedEntityAudit;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.trainingDayDate.TrainingDayDate;
import com.example.jwt.domain.trainingSet.TrainingSet;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "weekDay")
public class WeekDay extends ExtendedEntityAudit {

    @Column(name = "dayPlanname", nullable = false)
    private String dayPlanname;


    @Column(name = "dayName", nullable = true)
    private String dayName;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "weekDay_trainingSets",
            joinColumns = @JoinColumn(name = "weekDay_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "trainingSet_id", referencedColumnName = "id")
    )    private Set<TrainingSet> trainingSets;



    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "weekDay_exercise",
            joinColumns = @JoinColumn(name = "weekDay_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id", referencedColumnName = "id")
    )    private Set<Exercise> exercises;


    public WeekDay(String dayPlanname, String dayName, Set<TrainingSet> trainingSets, Set<Exercise> exercises) {
        this.dayPlanname = dayPlanname;
        this.dayName = dayName;
        this.trainingSets = trainingSets;
        this.exercises = exercises;
    }

    public WeekDay() {
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

    public Set<TrainingSet> getTrainingSets() {
        return trainingSets;
    }

    public void setTrainingSets(Set<TrainingSet> trainingSets) {
        this.trainingSets = trainingSets;
    }

    public Set<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<Exercise> exercises) {
        this.exercises = exercises;
    }
}
