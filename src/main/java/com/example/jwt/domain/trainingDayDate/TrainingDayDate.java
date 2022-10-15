package com.example.jwt.domain.trainingDayDate;

import com.example.jwt.core.generic.ExtendedEntityAudit;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.weekDay.WeekDay;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trainingDayDate")
public class TrainingDayDate extends ExtendedEntityAudit {

    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "weekDay_id")
    private WeekDay weekDay;

    public TrainingDayDate(Date date, WeekDay weekDay) {
        this.date = date;
        this.weekDay = weekDay;
    }

    public TrainingDayDate() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }
}

