package com.example.jwt.domain.userWeightHistory;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.user.User;
import com.example.jwt.domain.userWeightHistory.dto.UserBMIDTO;

public interface UserWeightHistoryService extends ExtendedService<UserWeightHistory> {

UserBMIDTO getBMIByUser();

}
