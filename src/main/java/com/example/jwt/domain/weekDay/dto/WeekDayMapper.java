package com.example.jwt.domain.weekDay.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.weekDay.WeekDay;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WeekDayMapper extends ExtendedMapper<WeekDay, WeekDayDTO> {


}
