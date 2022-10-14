package com.example.jwt.domain.excercise;

import com.example.jwt.core.generic.ExtendedRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends ExtendedRepository<Exercise> {

    Exercise findByName(String name);

}