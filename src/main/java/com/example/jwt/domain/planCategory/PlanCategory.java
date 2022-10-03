package com.example.jwt.domain.planCategory;

import com.example.jwt.core.generic.ExtendedEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PlanCategory")
@Data
public class PlanCategory extends ExtendedEntity {

    private String name;


}
