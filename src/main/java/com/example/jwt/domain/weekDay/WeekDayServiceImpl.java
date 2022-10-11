package com.example.jwt.domain.weekDay;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeekDayServiceImpl extends ExtendedServiceImpl<WeekDay> implements WeekDayService {


    @Autowired
    protected WeekDayServiceImpl(WeekDayRepository weekDayRepository ) {
        super(weekDayRepository);
    }



}


