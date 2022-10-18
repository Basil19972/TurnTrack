package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.domain.user.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public interface TrainingSetRepository extends ExtendedRepository<TrainingSet> {


    @Query(value = "select training_set.id from training_set\n" +
            "left join week_day wd on wd.id = training_set.week_day_id\n" +
            "left join training_day_date tdd on wd.id = tdd.week_day_id\n" +
            "where date = :currentDate \n" +
            "and wd.created_by = :user_id;", nativeQuery = true)
    List<TrainingSet> getTrainingsSetFromCurrentUser(@Param("user_id") UUID user_id, @Param("currentDate") Date currentDate);


}