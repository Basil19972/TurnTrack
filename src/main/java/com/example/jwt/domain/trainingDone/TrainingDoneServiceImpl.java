package com.example.jwt.domain.trainingDone;
import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.planCategory.PlanCategory;
import com.example.jwt.domain.planCategory.PlanCategoryRepository;
import com.example.jwt.domain.planCategory.PlanCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingDoneServiceImpl extends ExtendedServiceImpl<TrainingDone> implements TrainingDoneService {


    protected TrainingDoneServiceImpl(ExtendedRepository<TrainingDone> repository) {
        super(repository);
    }
}


