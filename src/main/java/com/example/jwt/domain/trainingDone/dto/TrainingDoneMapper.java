package com.example.jwt.domain.trainingDone.dto;

import com.example.jwt.domain.trainingDone.TrainingDone;
import com.example.jwt.core.generic.ExtendedMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TrainingDoneMapper extends ExtendedMapper<TrainingDone, TrainingDoneDTO> {
}

