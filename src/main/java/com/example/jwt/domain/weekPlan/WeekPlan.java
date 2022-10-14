package com.example.jwt.domain.weekPlan;

import com.example.jwt.core.generic.ExtendedEntityAudit;
import com.example.jwt.domain.weekDay.WeekDay;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.user.User;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "weekPlan")
public class WeekPlan extends ExtendedEntityAudit {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private Date date;


    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "day_id", nullable = false)
    private WeekDay weekDay;



    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User appuser;

    public WeekPlan(String name, Date date, WeekDay weekDay, User appuser) {
        this.name = name;
        this.date = date;
        this.weekDay = weekDay;
        this.appuser = appuser;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public WeekPlan() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public WeekDay getDay() {
        return weekDay;
    }

    public void setDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }


    public User getAppuser() {
        return appuser;
    }

    public void setAppuser(User appuser) {
        this.appuser = appuser;
    }
}
