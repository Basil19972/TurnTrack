package com.example.jwt.domain.weekPlan.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.weekPlan.WeekPlan;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WeekPlanMapper extends ExtendedMapper<WeekPlan, WeekPlanDTO> {


}
