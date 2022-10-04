package com.example.jwt.domain.trainingSet.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.trainingSet.TrainingSet;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TrainingSetMapper extends ExtendedMapper<TrainingSet, TrainingSetDTO> {


}
