package com.example.jwt.domain.weekPlan;

import com.example.jwt.core.generic.ExtendedService;

public interface WeekPlanService extends ExtendedService<WeekPlan> {

    WeekPlan createPlan(WeekPlan weekPlan);


}
