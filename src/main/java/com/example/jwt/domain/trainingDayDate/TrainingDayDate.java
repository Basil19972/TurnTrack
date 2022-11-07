package com.example.jwt.domain.trainingDayDate;

import com.example.jwt.core.generic.ExtendedEntityAudit;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.trainingDone.TrainingDone;
import com.example.jwt.domain.weekDay.WeekDay;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "trainingDayDate")
public class TrainingDayDate extends ExtendedEntityAudit {

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @OneToMany(mappedBy = "trainingDayDate", cascade = CascadeType.ALL )
    private Set<TrainingDone> trainingDones;

    public TrainingDayDate(LocalDateTime date, Set<TrainingDone> trainingDones) {
        this.date = date;
        this.trainingDones = trainingDones;
    }

    public TrainingDayDate() {
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Set<TrainingDone> getTrainingDones() {
        return trainingDones;
    }

    public void setTrainingDones(Set<TrainingDone> trainingDones) {
        this.trainingDones = trainingDones;
    }
}

