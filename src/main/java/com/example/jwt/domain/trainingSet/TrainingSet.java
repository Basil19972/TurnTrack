package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.excercise.Excercise;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "Set")
public class TrainingSet extends ExtendedEntity {

    @Column(name = "weight", nullable = false)
    private int weight;

    @Column(name = "repetitions", nullable = false)
    private int repetitions;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "excercise_id")
    private Excercise excercise;

    public TrainingSet(int weight, int repetitions, Excercise excercise) {
        this.weight = weight;
        this.repetitions = repetitions;
        this.excercise = excercise;
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

    public Excercise getExcercise() {
        return excercise;
    }

    public void setExcercise(Excercise excercise) {
        this.excercise = excercise;
    }
}
