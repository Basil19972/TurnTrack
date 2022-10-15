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

    @Column(name = "name", nullable = true)
    private String name;


    @OneToMany(mappedBy = "weekDay", cascade = CascadeType.ALL )
    private Set<TrainingSet> trainingSets;


    @OneToMany(mappedBy = "weekDay", cascade = CascadeType.MERGE )
    private Set<TrainingDayDate> trainingDayDates;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "weekDay_exercise",
            joinColumns = @JoinColumn(name = "weekDay_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id", referencedColumnName = "id")
    )    private Set<Exercise> exercises;





    public WeekDay(String name, Set<TrainingSet> trainingSets, Set<TrainingDayDate> trainingDayDates, Set<Exercise> exercises) {
        this.name = name;
        this.trainingSets = trainingSets;
        this.trainingDayDates = trainingDayDates;
        this.exercises = exercises;
    }

    public WeekDay() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TrainingSet> getTrainingSets() {
        return trainingSets;
    }

    public void setTrainingSets(Set<TrainingSet> trainingSets) {
        this.trainingSets = trainingSets;
    }

    public Set<TrainingDayDate> getTrainingDayDates() {
        return trainingDayDates;
    }

    public void setTrainingDayDates(Set<TrainingDayDate> trainingDayDates) {
        this.trainingDayDates = trainingDayDates;
    }

    public Set<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<Exercise> exercises) {
        this.exercises = exercises;
    }
}
