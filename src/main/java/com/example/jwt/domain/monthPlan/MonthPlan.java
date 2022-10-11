package com.example.jwt.domain.monthPlan;

import com.example.jwt.core.generic.ExtendedEntityAudit;

import com.example.jwt.domain.planCategory.PlanCategory;
import com.example.jwt.domain.user.User;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "monthPlan")
public class MonthPlan extends ExtendedEntityAudit {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "plancategory_id", nullable = false)
    private PlanCategory planCategory;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User appuser;

    public MonthPlan(String name, Date date, PlanCategory planCategory, User appuser) {
        this.name = name;
        this.date = date;
        this.planCategory = planCategory;
        this.appuser = appuser;
    }


    public MonthPlan() {

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
