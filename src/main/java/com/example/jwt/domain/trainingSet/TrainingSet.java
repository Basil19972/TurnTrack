package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.excercise.Excercise;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "Set")
@Data
public class TrainingSet extends ExtendedEntity {

    @Column(name = "weight", nullable = false)
    private int weight;

    @Column(name = "repetitions", nullable = false)
    private int repetitions;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "excercise_id")
    private Excercise excercise;


}
