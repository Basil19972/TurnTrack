package com.example.jwt.domain.excercise.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.excercise.Excercise;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ExerciseMapper extends ExtendedMapper<Excercise, ExerciseDTO> {


}
