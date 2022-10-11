package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.core.generic.ExtendedEntityAudit;
import com.example.jwt.domain.excercise.Exercise;

import javax.persistence.*;


@Entity
@Table(name = "TrainingSet")
public class TrainingSet extends ExtendedEntity {

    @Column(name = "weight", nullable = false)
    private int weight;

    @Column(name = "repetitions", nullable = false)
    private int repetitions;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "excercise_id")
    private Exercise exercise;




    public TrainingSet(int weight, int repetitions, Exercise exercise) {
        this.weight = weight;
        this.repetitions = repetitions;
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

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;

    }
}
