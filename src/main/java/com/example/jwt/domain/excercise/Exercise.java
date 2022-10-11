package com.example.jwt.domain.excercise;

import com.example.jwt.core.generic.ExtendedEntityAudit;
import com.example.jwt.domain.weekDay.WeekDay;
import com.example.jwt.domain.weekPlan.WeekPlan;
import com.example.jwt.domain.trainingSet.TrainingSet;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "excercise")
public class Exercise extends ExtendedEntityAudit {

    @Column(name = "name", nullable = true)
    private String name;

    @OneToMany(mappedBy = "exercise", cascade = CascadeType.ALL )
    private Set<TrainingSet> trainingSets;



    @ManyToMany
    @JoinTable(
            name = "exercise_weekday",
            joinColumns = @JoinColumn(name = "exercise_id"),
            inverseJoinColumns = @JoinColumn(name = "weekday_id"))
    private Set<WeekDay> weekDays;


    public Exercise(String name, Set<TrainingSet> trainingSets, Set<WeekDay> weekDays) {
        this.name = name;
        this.trainingSets = trainingSets;
        this.weekDays = weekDays;
    }

    public Exercise() {

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

    public Set<WeekDay> getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(Set<WeekDay> weekDays) {
        this.weekDays = weekDays;
    }
}
