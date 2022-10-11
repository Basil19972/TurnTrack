package com.example.jwt.domain.monthPlan.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.monthPlan.MonthPlan;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MonthPlanMapper extends ExtendedMapper<MonthPlan, MonthPlanDTO> {


}
