package com.example.jwt.domain.weekDay;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.excercise.Exercise;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "weekDay")
public class WeekDay extends ExtendedEntity {

    @Column(name = "name", nullable = true)
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "weekDay_exercise",
            joinColumns = @JoinColumn(name = "weekDay_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id", referencedColumnName = "id")
    )    private Set<Exercise> exercises;

    public WeekDay(String name, Set<Exercise> exercises) {
        this.name = name;
        this.exercises = exercises;
    }

    public WeekDay() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<Exercise> exercises) {
        this.exercises = exercises;
    }
}
