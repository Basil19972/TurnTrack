package com.example.jwt.domain.excercise;


import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.excercise.dto.ExerciseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/exercise")
public class ExerciseController {


    private final ExerciseService exerciseService;
    private final ExerciseMapper exerciseMapper;

    @Autowired
    public ExerciseController(ExerciseService exerciseService, ExerciseMapper exerciseMapper) {
        this.exerciseService = exerciseService;
        this.exerciseMapper = exerciseMapper;
    }

    @PostMapping()
    @PreAuthorize("hasAuthority('EXERCISE_WRITE')")
    public ResponseEntity<ExerciseDTO> createExercise(@RequestBody ExerciseDTO exerciseDTO) {
        return new ResponseEntity<>(exerciseMapper.toDTO(exerciseService.create(exerciseMapper.fromDTO(exerciseDTO))), HttpStatus.CREATED);
    }




}
