package com.example.jwt.domain.userWeightHistory;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.excercise.ExerciseService;
import com.example.jwt.domain.user.UserService;
import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;


@Service
public class UserWeightHistoryServiceImpl extends ExtendedServiceImpl<UserWeightHistory> implements UserWeightHistoryService {

    private final UserService userService;
    private  final ExerciseService exerciseService;


    @Autowired
    public UserWeightHistoryServiceImpl(UserWeightHistoryRepository userWeightHistoryRepository, UserService userService, ExerciseService exerciseService) {
        super(userWeightHistoryRepository);
        this.userService = userService;
        this.exerciseService = exerciseService;
    }

    @Override
    public UserWeightHistory save(UserWeightHistory userWeightHistory){
        userWeightHistory.setDate(Date.valueOf(java.time.LocalDate.now()));
        return super.save(userWeightHistory);
    }



}
