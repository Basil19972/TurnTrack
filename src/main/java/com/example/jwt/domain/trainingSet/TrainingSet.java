package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.trainingDone.TrainingDone;
import com.example.jwt.domain.weekDay.WeekDay;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "trainingSet")
public class TrainingSet extends ExtendedEntity {

    @Column(name = "weight", nullable = false)
    private int weight;

    @Column(name = "repetitions", nullable = false)
    private int repetitions;


    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;


    @OneToMany(mappedBy = "trainingSet", cascade = CascadeType.PERSIST )
    private Set<TrainingDone> trainingDones;



    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "trainingSets_Weekday",
            joinColumns = @JoinColumn(name = "trainingSet_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "weekday_id", referencedColumnName = "id")
    )
    private Set<WeekDay> weekDays ;




    public TrainingSet(int weight, int repetitions, Exercise exercise, Set<TrainingDone> trainingDones, Set<WeekDay> weekDays) {
        this.weight = weight;
        this.repetitions = repetitions;
        this.exercise = exercise;
        this.trainingDones = trainingDones;
        this.weekDays = weekDays;
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

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Set<TrainingDone> getTrainingDones() {
        return trainingDones;
    }

    public void setTrainingDones(Set<TrainingDone> trainingDones) {
        this.trainingDones = trainingDones;
    }

    public Set<WeekDay> getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(Set<WeekDay> weekDays) {
        this.weekDays = weekDays;
    }
}
