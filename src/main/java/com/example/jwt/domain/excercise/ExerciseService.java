package com.example.jwt.domain.excercise;

import com.example.jwt.core.generic.ExtendedService;

import java.util.UUID;

public interface ExerciseService extends ExtendedService<Exercise> {

    Exercise findByID(UUID id);

    Exercise create(Exercise exercise,int setNumber);








}
