package com.example.jwt.domain.trainingDone;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.trainingDayDate.TrainingDayDate;
import com.example.jwt.domain.trainingSet.TrainingSet;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "trainingDone")
public class TrainingDone extends ExtendedEntity {

    Boolean trainingDone;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trainingSet_id")
    private TrainingSet trainingSet;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trainingDayDate_id")
    private TrainingDayDate trainingDayDate;



}
