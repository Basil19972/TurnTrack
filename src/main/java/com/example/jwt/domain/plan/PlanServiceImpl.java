package com.example.jwt.domain.plan;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.time.LocalDate;


@Service
public class PlanServiceImpl extends ExtendedServiceImpl<Plan> implements PlanService {

    private final UserService userService;


    @Autowired
    public PlanServiceImpl(PlanRepository planRepository, UserService userService) {
        super(planRepository);
        this.userService = userService;
    }


    @Override
    @Transactional
    public Plan createPlan(Plan plan) {


      plan.getExercises().forEach(excercise -> System.out.println(excercise.getTrainingSets()));


        plan.setAppuser(userService.getCurrentUser());
        plan.setDate(Date.valueOf(LocalDate.now()));



        super.save(plan);



        return null;
    }
}
