package com.example.jwt.domain.plan;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Plan createPlan(Plan plan) {

        Plan plan1 = new Plan();

        System.out.println(plan.getDay());

        plan1.setName(plan.getName());
        plan1.setDay(plan.getDay());
        plan1.setExcercises(plan.getExcercises());
        plan1.setAppuser(userService.getCurrentUser());
        plan1.setDate(Date.valueOf(LocalDate.now()));
        plan1.setPlanCategory(plan.getPlanCategory());

        return super.getRepository().save(plan1);
    }
}
