package com.example.jwt.domain.excercise;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.trainingSet.TrainingSet;
import com.example.jwt.domain.trainingSet.TrainingSetService;
import com.example.jwt.domain.user.UserService;
import com.example.jwt.domain.weekDay.WeekDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
public class ExerciseServiceImpl extends ExtendedServiceImpl<Exercise> implements ExerciseService {

    private final UserService userService;
    private final TrainingSetService trainingSetService;
    private final ExerciseRepository exerciseRepository;


    @Autowired
    protected ExerciseServiceImpl(ExerciseRepository exerciseRepository, UserService userService, TrainingSetService trainingSetService, ExerciseRepository exerciseRepository1) {
        super(exerciseRepository);
        this.userService = userService;
        this.trainingSetService = trainingSetService;
        this.exerciseRepository = exerciseRepository1;
    }


    @Override
    public Exercise findByID(UUID id) {
        return super.findById(id);
    }




    @Override
    public Exercise updateById(UUID id, Exercise exercisenew){

        /*
        if (!super.existsById(id)) {
            throw new RuntimeException("Exercise with this ID do not exist!");
        }

            Exercise exerciseinDB = findByID(id);
            exerciseinDB.setTrainingSets(exercisenew.getTrainingSets());
            super.save(exerciseinDB);

            //Send in postman the trainingsset id to update it richtig
        //Create a get all endpoint to send all the empty exercise whit the emty trainings set to let them update propertly

            //Set ID to TrainingSet Table after the exercise is saved
            exercisenew.getTrainingSets().forEach(trainingSet -> { trainingSet.setRepetitions(0);
                trainingSet.setExercise(exerciseinDB); trainingSetService.updateById(trainingSet.getId(),trainingSet);
            });

         */
                return null; // findByID(exerciseinDB.getId());


        }
}


