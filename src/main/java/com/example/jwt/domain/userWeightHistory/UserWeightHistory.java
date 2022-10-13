package com.example.jwt.domain.userWeightHistory;

import com.example.jwt.core.generic.ExtendedEntityAudit;
import com.example.jwt.domain.planCategory.PlanCategory;
import com.example.jwt.domain.user.User;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "userWeightHistory")
public class UserWeightHistory extends ExtendedEntityAudit {

    @Column(name = "weight", nullable = false)
    private Double weight;

    @Column(name = "date", nullable = false)
    private Date date;

    public UserWeightHistory(Double weight, Date date) {
        this.weight = weight;
        this.date = date;
    }

    public UserWeightHistory() {

    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
