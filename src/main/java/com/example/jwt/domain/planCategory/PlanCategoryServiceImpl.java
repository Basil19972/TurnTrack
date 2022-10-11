package com.example.jwt.domain.planCategory;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.weekDay.WeekDay;
import com.example.jwt.domain.weekDay.WeekDayRepository;
import com.example.jwt.domain.weekDay.WeekDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanCategoryServiceImpl extends ExtendedServiceImpl<PlanCategory> implements PlanCategoryService {


    @Autowired
    protected PlanCategoryServiceImpl(PlanCategoryRepository planCategoryRepository ) {
        super(planCategoryRepository);
    }

    @Override
    public List<PlanCategory> findAll() {
        return super.findAll();
    }

}


