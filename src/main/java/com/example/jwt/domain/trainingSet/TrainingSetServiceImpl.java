package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.excercise.ExerciseService;
import com.example.jwt.domain.trainingDone.TrainingDoneService;
import com.example.jwt.domain.trainingSet.dto.DoExerciseTrainingsSetDTO;
import com.example.jwt.domain.trainingSet.dto.StatDateRepWeightExname;
import com.example.jwt.domain.user.UserService;
import com.example.jwt.domain.weekDay.WeekDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

import static java.time.LocalTime.now;

@Service
public class TrainingSetServiceImpl extends ExtendedServiceImpl<TrainingSet> implements TrainingSetService {

    private final TrainingSetRepository trainingSetRepository;
    private final UserService userService;



    @Autowired
    public TrainingSetServiceImpl(TrainingSetRepository repository, TrainingSetRepository trainingSetRepository, UserService userService) {
        super(repository);
        this.trainingSetRepository = trainingSetRepository;
        this.userService = userService;
    }






    public List<TrainingSet> findAllTrainingsSetFromCurrentUser(){

        LocalDateTime currentDate = LocalDateTime.now();

        UUID user_UUID = userService.getCurrentUser().getId();

        return trainingSetRepository.getTrainingsSetFromCurrentUser(user_UUID,currentDate);
    }

    @Override
    public List<StatDateRepWeightExname> getAllWeightRepsFromLastMonth() {
        UUID user_UUID = userService.getCurrentUser().getId();
        return (List<StatDateRepWeightExname>) trainingSetRepository.getWeightRepsFromLastMonth(user_UUID);
    }


    @Override
    public List<DoExerciseTrainingsSetDTO> findAllTrainingsSetToDoExercises(){
        UUID user_UUID = userService.getCurrentUser().getId();
        return trainingSetRepository.getTrainingsetToDoExercises(user_UUID);
    }

    @Override
    public List<TrainingSet> createNewWorkout(List<TrainingSet> trainingSet) {


        trainingSet.forEach(trainingSet1 -> {

            System.out.println("-------->" +trainingSet1.getWeekDays());
            save(trainingSet1);

        });







        //get the exercise and save them in the trainingset Object
        //get the weekday from the given id and save it in the aswell
        //create a new training_day:date object whit the curent date and save ixt
        //create a new trainingdone object and save it




        return trainingSet;
    }


}
