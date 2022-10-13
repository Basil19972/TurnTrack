package com.example.jwt.domain.userWeightHistory.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.userWeightHistory.UserWeightHistory;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserWeightHistoryMapper extends ExtendedMapper<UserWeightHistory, UserWeightHistoryDTO> {


}
