package com.example.jwt.domain.excercise;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.weekDay.WeekDay;

import java.util.List;
import java.util.UUID;

public interface ExerciseService extends ExtendedService<Exercise> {

    Exercise findByID(UUID id);

    List<Exercise> findAllByUser();









}
