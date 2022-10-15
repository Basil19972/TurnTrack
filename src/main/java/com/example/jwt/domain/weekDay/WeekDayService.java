package com.example.jwt.domain.weekDay;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.excercise.Exercise;

public interface WeekDayService extends ExtendedService<WeekDay> {

    WeekDay create(WeekDay weekDay);



}
