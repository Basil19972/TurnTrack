package com.example.jwt.domain.plan;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.day.Day;
import com.example.jwt.domain.excercise.Excercise;
import com.example.jwt.domain.planCategory.PlanCategory;
import com.example.jwt.domain.user.User;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "plan")
@Data
public class Plan extends ExtendedEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "day_id", nullable = false)
    private Day day;

    @OneToMany(mappedBy = "plan", cascade = CascadeType.PERSIST )
    private Set<Excercise> excercises;

    @ManyToOne
    @JoinColumn(name = "plancategory_id", nullable = false)
    private PlanCategory planCategory;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true)
    private User appuser;
}
