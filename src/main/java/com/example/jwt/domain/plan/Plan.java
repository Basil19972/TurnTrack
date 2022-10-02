package com.example.jwt.domain.plan;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.days.Days;
import com.example.jwt.domain.excercise.Excercise;

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
    @JoinColumn(name = "day_id", nullable = false)
    private Days days;

    @OneToMany(mappedBy = "plan", cascade = CascadeType.PERSIST )
    private Set<Excercise> excercises;

  //  @ManyToOne
  //  @JoinColumn(name = "category_id", nullable = false)
   // private Category category;
}
