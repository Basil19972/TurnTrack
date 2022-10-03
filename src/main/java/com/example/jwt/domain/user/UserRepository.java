package com.example.jwt.domain.user;

import com.example.jwt.core.generic.ExtendedRepository;

import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.Set;


@Repository
public interface UserRepository extends ExtendedRepository<User> {
    Optional<User> findByEmail(String email);





    //between to dates ergänzen

}
