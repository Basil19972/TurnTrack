package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.excercise.Exercise;
import com.example.jwt.domain.weekDay.WeekDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
public class TrainingSetServiceImpl extends ExtendedServiceImpl<TrainingSet> implements TrainingSetService {


    @Autowired
    public TrainingSetServiceImpl(TrainingSetRepository repository) {
        super(repository);
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


        // Funktioniert nicht ganz
        TrainingSet trainingSetold = findById(trainingSetnew.getId());

        /*
        trainingSet1.setRepetitions(trainingSet.getRepetitions());
        trainingSet1.setWeight(trainingSet.getWeight());

         */


        return null; // save(trainingSet1);
    }


}
