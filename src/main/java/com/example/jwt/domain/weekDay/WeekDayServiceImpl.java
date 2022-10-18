package com.example.jwt.domain.weekDay;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.excercise.ExerciseService;
import com.example.jwt.domain.trainingDayDate.TrainingDayDate;
import com.example.jwt.domain.trainingDayDate.TrainingDayDateService;
import com.example.jwt.domain.trainingSet.TrainingSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WeekDayServiceImpl extends ExtendedServiceImpl<WeekDay> implements WeekDayService {

    private final TrainingDayDateService trainingDayDateService;
    private final TrainingSetService trainingSetService;
    private final ExerciseService exerciseService;

    @Autowired
    protected WeekDayServiceImpl(WeekDayRepository weekDayRepository, TrainingDayDateService trainingDayDateService, TrainingSetService trainingSetService, ExerciseService exerciseService) {
        super(weekDayRepository);
        this.trainingDayDateService = trainingDayDateService;
        this.trainingSetService = trainingSetService;
        this.exerciseService = exerciseService;
    }


    @Override
    public WeekDay create(WeekDay weekDay) {

        save(weekDay);

        ArrayList<Exercise> exercises = new ArrayList<>();
        weekDay.getExercises().forEach(exercise -> exercises.add(exerciseService.findByID(exercise.getId())));

        //Save the TrainingSets
        for(int i = 0; i < weekDay.getExercises().size(); i++ ){
            int amountOffSets = exercises.get(i).getAmountOfSets();
            trainingSetService.createDefaultTrainingSet(weekDay, amountOffSets, exercises.get(i));
        }

        //Save all the TrainingDayDate Entities nd add the Weekday id to them
        weekDay.getTrainingDayDates().forEach(trainingDayDate -> {
            trainingDayDate.setWeekDay(weekDay);
            trainingDayDateService.save(trainingDayDate);
        });

      return findById(weekDay.getId());




    }
}


