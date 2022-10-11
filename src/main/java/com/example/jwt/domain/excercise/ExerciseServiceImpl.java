package com.example.jwt.domain.excercise;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.trainingSet.TrainingSetService;
import com.example.jwt.domain.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Exercise create(Exercise exercise) {

        super.save(exercise);
        System.out.println("ID------------>"+exercise.getId());
        //Set ID to TrainingSet Table after the exercise is saved
        exercise.getTrainingSets().forEach(trainingSet -> {
            trainingSet.setExercise(exercise); trainingSetService.updateById(trainingSet.getId(),trainingSet);
        });

        return super.findById(exercise.getId());

    }

}
