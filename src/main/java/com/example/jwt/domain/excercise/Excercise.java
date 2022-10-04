package com.example.jwt.domain.excercise;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.plan.Plan;
import com.example.jwt.domain.trainingSet.TrainingSet;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "excercise")
public class Excercise extends ExtendedEntity {

    private String name;

    @OneToMany(mappedBy = "excercise", cascade = CascadeType.PERSIST )
    private Set<TrainingSet> trainingSets;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plan_id")
    private Plan plan;

    public Excercise(String name, Set<TrainingSet> trainingSets, Plan plan) {
        this.name = name;
        this.trainingSets = trainingSets;
        this.plan = plan;
    }

    public Excercise() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TrainingSet> getTrainingSets() {
        return trainingSets;
    }

    public void setTrainingSets(Set<TrainingSet> trainingSets) {
        this.trainingSets = trainingSets;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
