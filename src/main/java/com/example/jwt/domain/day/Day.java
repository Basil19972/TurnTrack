package com.example.jwt.domain.day;

import com.example.jwt.core.generic.ExtendedEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "days")
public class Day extends ExtendedEntity {

    @Column(name = "name", nullable = true)
    private String name;

    public Day(String name) {
        this.name = name;
    }

    public Day() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
