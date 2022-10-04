package com.example.jwt.domain.planCategory.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.excercise.Excercise;
import com.example.jwt.domain.planCategory.PlanCategory;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlanCategoryMapper extends ExtendedMapper<PlanCategory, PlanCategoryDTO> {


}
