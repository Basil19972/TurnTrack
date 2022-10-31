package com.example.jwt.domain.weekDay;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.excercise.ExerciseService;
import com.example.jwt.domain.trainingDayDate.TrainingDayDate;
import com.example.jwt.domain.trainingDayDate.TrainingDayDateService;
import com.example.jwt.domain.trainingSet.TrainingSetService;
import com.example.jwt.domain.user.User;
import com.example.jwt.domain.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class WeekDayServiceImpl extends ExtendedServiceImpl<WeekDay> implements WeekDayService {

    private final TrainingDayDateService trainingDayDateService;
    private final TrainingSetService trainingSetService;
    private final ExerciseService exerciseService;
    private final UserService userService;
    private final WeekDayRepository weekDayRepository;

    @Autowired
    protected WeekDayServiceImpl(WeekDayRepository weekDayRepository, TrainingDayDateService trainingDayDateService, TrainingSetService trainingSetService, ExerciseService exerciseService, UserService userService, WeekDayRepository weekDayRepository1) {
        super(weekDayRepository);
        this.trainingDayDateService = trainingDayDateService;
        this.trainingSetService = trainingSetService;
        this.exerciseService = exerciseService;
        this.userService = userService;
        this.weekDayRepository = weekDayRepository1;
    }


    @Override
    public WeekDay create(WeekDay weekDay) {

        weekDay.setTrainingDone(false);
        save(weekDay);

        ArrayList<Exercise> exercises = new ArrayList<>();
        weekDay.getExercises().forEach(exercise -> exercises.add(exerciseService.findByID(exercise.getId())));

        //Save the TrainingSets
        for(int i = 0; i < weekDay.getExercises().size(); i++ ){
            int amountOffSets = exercises.get(i).getAmountOfSets();
            trainingSetService.createDefaultTrainingSet(weekDay, amountOffSets, exercises.get(i));
        }

      return findById(weekDay.getId());

    }

    @Override
    public WeekDay updateToDoneById(UUID uuid) {
        WeekDay currentWeekday = findById(uuid);
/*
        Format f = new SimpleDateFormat("EEEE");
        LocalDate localDate= LocalDate.now();
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        String str = f.format(java.time.LocalDate.now());
        System.out.println(str);

 */


        //Save all the TrainingDayDate Entities nd add the Weekday id to them
        TrainingDayDate trainingDayDate = new TrainingDayDate();
        trainingDayDate.setWeekDay(currentWeekday);
        trainingDayDate.setDate(LocalDateTime.now());
        trainingDayDateService.save(trainingDayDate);




        currentWeekday.setTrainingDone(true);
        save(currentWeekday);

        return currentWeekday;
    }

    @Override
    public List<WeekDay> findAllByUserID() {

        return weekDayRepository.getAllByCreatedBy(userService.getCurrentUser());
    }


}


