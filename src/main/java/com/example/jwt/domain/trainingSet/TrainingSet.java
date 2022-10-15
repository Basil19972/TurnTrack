package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.core.generic.ExtendedEntityAudit;
import com.example.jwt.domain.excercise.Exercise;
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

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "weekDay_id")
    private WeekDay weekDay;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    public TrainingSet(int weight, int repetitions, WeekDay weekDay, Exercise exercise) {
        this.weight = weight;
        this.repetitions = repetitions;
        this.weekDay = weekDay;
        this.exercise = exercise;
    }

    public TrainingSet() {
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
