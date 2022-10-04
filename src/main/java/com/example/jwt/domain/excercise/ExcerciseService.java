package com.example.jwt.domain.excercise;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.day.Day;

import java.util.UUID;

public interface ExcerciseService extends ExtendedService<Excercise> {

    Excercise findByID(UUID id);


}
