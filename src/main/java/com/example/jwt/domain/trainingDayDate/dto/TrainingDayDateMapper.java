package com.example.jwt.domain.trainingDayDate.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.trainingDayDate.TrainingDayDate;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TrainingDayDateMapper extends ExtendedMapper<TrainingDayDate, TrainingDayDateDTO> {


}
