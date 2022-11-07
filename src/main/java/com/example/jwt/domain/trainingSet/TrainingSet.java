package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.trainingDone.TrainingDone;
import com.example.jwt.domain.weekDay.WeekDay;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "TrainingSet")
public class TrainingSet extends ExtendedEntity {

    @Column(name = "weight", nullable = false)
    private int weight;

    @Column(name = "repetitions", nullable = false)
    private int repetitions;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weekDay_id")
    private WeekDay weekDay;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;


    @OneToMany(mappedBy = "trainingSet", cascade = CascadeType.ALL )
    private Set<TrainingDone> trainingDones;

    public TrainingSet(int weight, int repetitions, WeekDay weekDay, Exercise exercise, Set<TrainingDone> trainingDones) {
        this.weight = weight;
        this.repetitions = repetitions;
        this.weekDay = weekDay;
        this.exercise = exercise;
        this.trainingDones = trainingDones;
    }

    public TrainingSet() {
    }

    public Set<TrainingDone> getTrainingDones() {
        return trainingDones;
    }

    public void setTrainingDones(Set<TrainingDone> trainingDones) {
        this.trainingDones = trainingDones;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }
}
