package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.excercise.Excercise;
import lombok.Data;

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
    private Excercise exercise;

    public TrainingSet(int weight, int repetitions, Excercise exercise) {
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

    public Excercise getExercise() {
        return exercise;
    }

    public void setExercise(Excercise exercise) {
        this.exercise = exercise;
    }
}
