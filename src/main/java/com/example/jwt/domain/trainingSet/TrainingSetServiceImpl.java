package com.example.jwt.domain.trainingSet;

import com.example.jwt.core.generic.ExtendedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingSetServiceImpl extends ExtendedServiceImpl<TrainingSet> implements TrainingSetService {


    @Autowired
    public TrainingSetServiceImpl(TrainingSetRepository repository) {
        super(repository);
    }




}
