package com.example.jwt.domain.monthPlan;
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
public class MonthPlanServiceImpl extends ExtendedServiceImpl<MonthPlan> implements MonthPlanService {

    private final UserService userService;
    private  final ExerciseService exerciseService;


    @Autowired
    public MonthPlanServiceImpl(MonthPlanRepository monthPlanRepository, UserService userService, ExerciseService exerciseService) {
        super(monthPlanRepository);
        this.userService = userService;
        this.exerciseService = exerciseService;
    }



}
