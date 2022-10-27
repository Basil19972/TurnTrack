package com.example.jwt.domain.excercise;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.domain.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseRepository extends ExtendedRepository<Exercise> {

    Exercise findByName(String name);


    List<Exercise> findAllByCreatedBy(User user);
}