package com.example.jwt.domain.weekDay;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.user.User;

import java.util.List;
import java.util.UUID;

public interface WeekDayService extends ExtendedService<WeekDay> {

    WeekDay create(WeekDay weekDay);

    WeekDay updateToDoneById(UUID uuid);

    List<WeekDay> findAllByUserID();

}






