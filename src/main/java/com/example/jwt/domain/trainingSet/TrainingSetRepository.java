package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.domain.trainingSet.dto.DoExerciseTrainingsSetDTO;
import com.example.jwt.domain.trainingSet.dto.StatDateRepWeightExname;
import com.example.jwt.domain.user.User;
import org.hibernate.annotations.Type;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.*;


@Repository
public interface TrainingSetRepository extends ExtendedRepository<TrainingSet> {

    @Modifying
    @Type(type = "pg-uuid")
    @Query(value = "select training_set.id from training_set\n" +
            "left join week_day wd on wd.id = training_set.week_day_id\n" +
            "left join training_day_date tdd on wd.id = tdd.week_day_id\n" +
            "where date = :currentDate \n" +
            "and wd.created_by = cast(:user_id as varchar)", nativeQuery = true)
    List<TrainingSet> getTrainingsSetFromCurrentUser(@Param("user_id") UUID user_id, @Param("currentDate") LocalDateTime currentDate);



    @Modifying
    @Type(type = "pg-uuid")
    @Query(value = "select date as date, ts.repetitions as repetitions, ts.weight as weight, e.name as exercisename  from week_day\n" +
            "left join training_day_date tdd on week_day.id = tdd.week_day_id\n" +
            "left join training_set ts on week_day.id = ts.week_day_id\n" +
            "left join excercise e on ts.exercise_id = e.id\n" +
            "left join users u on e.created_by = u.id\n" +
            "where date > CURRENT_DATE - INTERVAL '1 months'\n" +
            "and u.id = cast(:user_id as varchar)", nativeQuery = true)
    List<StatDateRepWeightExname> getWeightRepsFromLastMonth(@Param("user_id") UUID user_id);



    @Modifying
    @Type(type = "pg-uuid")
    @Query(value = "select training_set.id as trainingssetID, wd.day_planname as dayplanname, e.name as exercisename, training_set.repetitions as reps, training_set.weight as weight  from training_set\n" +
            "left join week_day wd on wd.id = training_set.week_day_id\n" +
            "left join training_day_date tdd on wd.id = tdd.week_day_id\n" +
            "left join excercise e on training_set.exercise_id = e.id\n" +
            "where wd.training_done=true\n" +
            "and wd.created_by = cast(:user_id as varchar);", nativeQuery = true)
    List<DoExerciseTrainingsSetDTO> getTrainingsetToDoExercises(@Param("user_id") UUID user_id);

}