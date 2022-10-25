package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.trainingSet.dto.StatDateRepWeightExname;
import com.example.jwt.domain.user.User;
import com.example.jwt.domain.user.UserService;
import com.example.jwt.domain.weekDay.WeekDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

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

    @Override
    public Set<TrainingSet> createDefaultTrainingSet(WeekDay weekday, int amountOffSets, Exercise exercise) {

        //Creat Empty Objects
        Set<TrainingSet> trainingSets = new HashSet<>();
        for(int i = 0; i< amountOffSets;i++){
            trainingSets.add(new TrainingSet());
        }
        //Set Weekday UUID and Save them
        trainingSets.forEach(trainingSet -> {trainingSet.setWeekDay(weekday);
            trainingSet.setExercise(exercise);
            save(trainingSet);});

            return trainingSets ;
        }

    @Override
    public TrainingSet UpdateTrainingSetByID(UUID id, TrainingSet trainingSetnew) {

        if (existsById(id)) {
            TrainingSet trainingSetCurrent = findById(id);

            trainingSetnew.setId(id);
            trainingSetnew.setExercise(trainingSetCurrent.getExercise());
            trainingSetnew.setWeekDay(trainingSetCurrent.getWeekDay());

            return save(trainingSetnew);
        } else {
            throw new NoSuchElementException(String.format("Entity with ID '%s' could not be found", id));
        }
    }

    //funktionier noch ncht ganz

    public List<TrainingSet> findAllTrainingsSetFromCurrentUser(){

        LocalDate currentLocalDate = LocalDate.now();
        ZoneId systemTimeZone = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = currentLocalDate.atStartOfDay(systemTimeZone);
        Date currentDate = Date.from(zonedDateTime.toInstant());

        UUID user_UUID = userService.getCurrentUser().getId();

        System.out.println(user_UUID + currentDate.toString());
        return trainingSetRepository.getTrainingsSetFromCurrentUser(user_UUID,currentDate);
    }

    @Override
    public List<StatDateRepWeightExname> getAllWeightRepsFromLastMonth() {
        UUID user_UUID = userService.getCurrentUser().getId();
        return (List<StatDateRepWeightExname>) trainingSetRepository.getWeightRepsFromLastMonth(user_UUID);
    }


}
