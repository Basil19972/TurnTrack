package com.example.jwt.domain.weekPlan;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.excercise.ExerciseService;
import com.example.jwt.domain.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.time.LocalDate;


@Service
public class WeekPlanServiceImpl extends ExtendedServiceImpl<WeekPlan> implements WeekPlanService {

    private  final ExerciseService exerciseService;


    @Autowired
    public WeekPlanServiceImpl(WeekPlanRepository weekPlanRepository, ExerciseService exerciseService) {
        super(weekPlanRepository);
        this.exerciseService = exerciseService;
    }


    @Override
    public WeekPlan createPlan(WeekPlan weekPlan) {

        return null;
    }
}
