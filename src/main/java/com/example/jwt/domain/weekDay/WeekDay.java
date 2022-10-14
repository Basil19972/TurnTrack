package com.example.jwt.domain.weekDay;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.excercise.Exercise;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "weekDay")
public class WeekDay extends ExtendedEntity {

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "trainingDayDate", nullable = true)
    private Date trainingDayDate;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "weekDay_exercise",
            joinColumns = @JoinColumn(name = "weekDay_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id", referencedColumnName = "id")
    )    private Set<Exercise> exercises;



    public WeekDay() {

    }

    public WeekDay(String name, Date trainingDayDate, Set<Exercise> exercises) {
        this.name = name;
        this.trainingDayDate = trainingDayDate;
        this.exercises = exercises;
    }

    public Date getTrainingDayDate() {
        return trainingDayDate;
    }

    public void setTrainingDayDate(Date trainingDayDate) {
        this.trainingDayDate = trainingDayDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<Exercise> exercises) {
        this.exercises = exercises;
    }
}
