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

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Column(name = "archived", nullable = false)
    private Boolean archived;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "WeekDay_id", nullable = false)
    private WeekDay weekDay;




    public WeekPlan(String name, Boolean active, Boolean archived, WeekDay weekDay) {
        this.name = name;
        this.active = active;
        this.archived = archived;
        this.weekDay = weekDay;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public WeekDay getDay() {
        return weekDay;
    }

    public void setDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }



}
