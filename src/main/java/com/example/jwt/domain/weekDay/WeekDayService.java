package com.example.jwt.domain.weekDay;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.excercise.Exercise;

import java.util.UUID;

public interface WeekDayService extends ExtendedService<WeekDay> {

    WeekDay create(WeekDay weekDay);

    WeekDay updateToDoneById(UUID uuid);

}






