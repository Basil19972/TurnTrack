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

    @ManyToOne
    @JoinColumn(name = "day_id", nullable = true)
    private Day day;

    @OneToMany(mappedBy = "plan", cascade = CascadeType.PERSIST )
    private Set<Excercise> excercises;

    @ManyToOne
    @JoinColumn(name = "plancategory_id", nullable = true)
    private PlanCategory planCategory;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true)
    private User appuser;

    public Plan(String name, Date date, Day day, Set<Excercise> excercises, PlanCategory planCategory, User appuser) {
        this.name = name;
        this.date = date;
        this.day = day;
        this.excercises = excercises;
        this.planCategory = planCategory;
        this.appuser = appuser;
    }

    public Plan() {

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

    public Set<Excercise> getExcercises() {
        return excercises;
    }

    public void setExcercises(Set<Excercise> excercises) {
        this.excercises = excercises;
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
