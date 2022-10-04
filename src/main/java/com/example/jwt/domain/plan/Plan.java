package com.example.jwt.domain.plan;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.day.Day;
import com.example.jwt.domain.excercise.Excercise;
import com.example.jwt.domain.planCategory.PlanCategory;
import com.example.jwt.domain.user.User;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "plan")
public class Plan extends ExtendedEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "day_id", nullable = false)
    private Day day;

    @OneToMany(mappedBy = "plan", cascade = CascadeType.PERSIST )
    private Set<Excercise> exercises;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "plancategory_id", nullable = false)
    private PlanCategory planCategory;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User appuser;

    public Plan(String name, Date date, Day day, Set<Excercise> exercises, PlanCategory planCategory, User appuser) {
        this.name = name;
        this.date = date;
        this.day = day;
        this.exercises = exercises;
        this.planCategory = planCategory;
        this.appuser = appuser;
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

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Set<Excercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<Excercise> exercises) {
        this.exercises = exercises;
    }

    public PlanCategory getPlanCategory() {
        return planCategory;
    }

    public void setPlanCategory(PlanCategory planCategory) {
        this.planCategory = planCategory;
    }

    public User getAppuser() {
        return appuser;
    }

    public void setAppuser(User appuser) {
        this.appuser = appuser;
    }
}
