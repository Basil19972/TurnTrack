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

    public TrainingDone(Boolean trainingDone, TrainingSet trainingSet, TrainingDayDate trainingDayDate) {
        this.trainingDone = trainingDone;
        this.trainingSet = trainingSet;
        this.trainingDayDate = trainingDayDate;
    }

    public TrainingDone() {

    }

    public Boolean getTrainingDone() {
        return trainingDone;
    }

    public void setTrainingDone(Boolean trainingDone) {
        this.trainingDone = trainingDone;
    }

    public TrainingSet getTrainingSet() {
        return trainingSet;
    }

    public void setTrainingSet(TrainingSet trainingSet) {
        this.trainingSet = trainingSet;
    }

    public TrainingDayDate getTrainingDayDate() {
        return trainingDayDate;
    }

    public void setTrainingDayDate(TrainingDayDate trainingDayDate) {
        this.trainingDayDate = trainingDayDate;
    }
}
