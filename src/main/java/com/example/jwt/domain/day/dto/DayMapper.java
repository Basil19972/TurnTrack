package com.example.jwt.domain.day.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.day.Day;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DayMapper extends ExtendedMapper<Day, DayDTO> {


}
