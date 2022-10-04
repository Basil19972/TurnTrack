package com.example.jwt.domain.excercise;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class ExcerciseServiceImpl extends ExtendedServiceImpl<Excercise> implements ExcerciseService {

    private final ExcerciseService excerciseService;

    @Autowired
    public ExcerciseServiceImpl(ExcerciseRepository excerciseRepository, ExcerciseService excerciseService) {
        super(excerciseRepository);
        this.excerciseService = excerciseService;
    }


    @Override
    public Excercise findByID(UUID id) {
        return super.findById(id);
    }
}
