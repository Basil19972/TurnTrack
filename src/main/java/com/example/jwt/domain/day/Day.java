package com.example.jwt.domain.day;

import com.example.jwt.core.generic.ExtendedEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "days")
@Data
public class Day extends ExtendedEntity {

    @Column(name = "name", nullable = false)
    private String name;




}
