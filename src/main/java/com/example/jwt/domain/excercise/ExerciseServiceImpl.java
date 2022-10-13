package com.example.jwt.domain.excercise;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.trainingSet.TrainingSet;
import com.example.jwt.domain.trainingSet.TrainingSetService;
import com.example.jwt.domain.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;

@Service
public class ExerciseServiceImpl extends ExtendedServiceImpl<Exercise> implements ExerciseService {

    private final UserService userService;
    private final TrainingSetService trainingSetService;


    @Autowired
    protected ExerciseServiceImpl(ExerciseRepository exerciseRepository, UserService userService, TrainingSetService trainingSetService) {
        super(exerciseRepository);
        this.userService = userService;
        this.trainingSetService = trainingSetService;
    }


    @Override
    public Exercise findByID(UUID id) {
        return super.findById(id);
    }



    @Override
    public Exercise create(Exercise exercise,int setNumber) {

        // Fill an Exercise whit amount off empty Trainings sets to Fill whit values later
        Set<TrainingSet> trainingSets = new HashSet<>();
        for(int i = 0; i< setNumber;i++){
            trainingSets.add(new TrainingSet());
        }
        exercise.setTrainingSets(trainingSets);

        super.save(exercise);

        //Set ID to TrainingSet Table after the exercise is saved
        exercise.getTrainingSets().forEach(trainingSet -> {
            trainingSet.setExercise(exercise); trainingSetService.updateById(trainingSet.getId(),trainingSet);
        });

        return super.findById(exercise.getId());

    }

    @Override
    public Exercise updateById(UUID id, Exercise exercisenew){

        if (!super.existsById(id)) {
            throw new RuntimeException("Exercise with this ID do not exist!");
        }

            Exercise exerciseinDB = findByID(id);
            exerciseinDB.setTrainingSets(exercisenew.getTrainingSets());
            super.save(exerciseinDB);

            //Send in postman the trainingsset id to update it richtig
        //Create a get all endpoint to send all the empty exercise whit the emty trainings set to let them update propertly

            //Set ID to TrainingSet Table after the exercise is saved
            exercisenew.getTrainingSets().forEach(trainingSet -> {
                trainingSet.setExercise(exerciseinDB); trainingSetService.updateById(trainingSet.getId(),trainingSet);
            });
                return findByID(exerciseinDB.getId());


        }
}


