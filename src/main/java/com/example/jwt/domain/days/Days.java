package com.example.jwt.domain.days;

import com.example.jwt.core.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "days")
public class Days extends ExtendedEntity {

    @Column(name = "name", nullable = false)
    private String name;



    public Days(String name) {
        this.name = name;
    }

    public Days() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
