package com.example.jwt.domain.plan.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.plan.Plan;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlanMapper extends ExtendedMapper<Plan, PlanDTO> {


}
