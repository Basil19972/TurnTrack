package com.example.jwt.domain.weekDay;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.domain.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeekDayRepository extends ExtendedRepository<WeekDay> {

    List<WeekDay> getAllByCreatedBy(User user);

}