package com.example.jwt.domain.plan;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.domain.day.Day;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends ExtendedRepository<Plan> {

}