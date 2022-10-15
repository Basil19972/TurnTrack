package com.example.jwt.domain.trainingDayDate;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class TrainingDayDateServiceImpl extends ExtendedServiceImpl<TrainingDayDate> implements TrainingDayDateService {


    private final TrainingDayDateRepository trainingDayDateRepository;

    @Autowired
    public TrainingDayDateServiceImpl(TrainingDayDateRepository trainingDayDateRepository, TrainingDayDateRepository trainingDayDateRepository1) {
        super(trainingDayDateRepository);

        this.trainingDayDateRepository = trainingDayDateRepository1;
    }


    @Override
    public TrainingDayDate findTrainingDateDate(Date date) {

        return trainingDayDateRepository.findByDate(date);
    }


}
