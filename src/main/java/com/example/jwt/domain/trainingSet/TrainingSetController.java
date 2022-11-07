package com.example.jwt.domain.trainingSet;


import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.trainingSet.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;
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


    @PostMapping("")
    @PreAuthorize("hasAuthority('EXERCISE_WRITE')")
    public ResponseEntity<List<TrainingSetDTO>> createNewWorkout(@RequestBody List<TrainingSetDTO> trainingSetDTOS) {
        return new ResponseEntity<>(trainingSetMapper.toDTOs(trainingSetService.createNewWorkout(trainingSetMapper.fromDTOs(trainingSetDTOS))), HttpStatus.CREATED);
    }
    3.


    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('EXERCISE_WRITE')")
    public ResponseEntity<TrainingSetDTO> updateById(@PathVariable UUID id, @Validated @RequestBody TrainingSetDTO trainingSet) {
        return new ResponseEntity<>(trainingSetMapper.toDTO(trainingSetService.UpdateTrainingSetByID(id,trainingSetMapper.fromDTO(trainingSet))), HttpStatus.OK);
    }

    @GetMapping("")
    @PreAuthorize("hasAuthority('EXERCISE_READ')")
    public ResponseEntity<List<TrainingSetDTO>> findAllFromCurrentDateByCurrentUser() {
        List<TrainingSetDTO> trainingSetDTOS = trainingSetMapper.toDTOs(trainingSetService.findAllTrainingsSetFromCurrentUser());
        return new ResponseEntity<>(trainingSetDTOS, HttpStatus.OK);
    }


    @GetMapping("/stat1")
    @PreAuthorize("hasAuthority('EXERCISE_READ')")
    public ResponseEntity<List<StatDateRepWeightExname>> findAllWeightRepsFromLastMonth() {
        return new ResponseEntity<>(trainingSetService.getAllWeightRepsFromLastMonth(), HttpStatus.OK);
    }


    @GetMapping("/start")
    @PreAuthorize("hasAuthority('EXERCISE_READ')")
    public ResponseEntity<List<DoExerciseTrainingsSetDTO>> findAllTrainingsSetsToDoExercses() {
        List<DoExerciseTrainingsSetDTO> doExerciseTrainingsSetDTOS = trainingSetService.findAllTrainingsSetToDoExercises();
        return new ResponseEntity<>(doExerciseTrainingsSetDTOS, HttpStatus.OK);
    }




}
