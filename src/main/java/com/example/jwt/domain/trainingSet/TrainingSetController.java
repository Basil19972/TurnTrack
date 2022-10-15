package com.example.jwt.domain.trainingSet;


import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.trainingSet.dto.TrainingSetDTO;
import com.example.jwt.domain.trainingSet.dto.TrainingSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Validated
@RestController
@RequestMapping("/trainingset")
public class TrainingSetController {


    private final TrainingSetService trainingSetService;
    private final TrainingSetMapper trainingSetMapper;

    @Autowired
    public TrainingSetController(TrainingSetService trainingSetService, TrainingSetMapper trainingSetMapper) {
        this.trainingSetService = trainingSetService;
        this.trainingSetMapper = trainingSetMapper;
    }




    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('EXERCISE_WRITE')")
    public ResponseEntity<TrainingSetDTO> updateById(@PathVariable UUID id, @Validated @RequestBody TrainingSetDTO trainingSet) {
        return new ResponseEntity<>(trainingSetMapper.toDTO(trainingSetService.UpdateTrainingSetByID(id,trainingSetMapper.fromDTO(trainingSet))), HttpStatus.OK);
    }




}
