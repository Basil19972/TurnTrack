package com.example.jwt.domain.excercise;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.plan.Plan;
import com.example.jwt.domain.trainingSet.TrainingSet;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "excercise")
@Data
public class Excercise extends ExtendedEntity {

    private String name;

    @OneToMany(mappedBy = "excercise", cascade = CascadeType.PERSIST )
    private Set<TrainingSet> trainingSets;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plan_id")
    private Plan plan;




}
