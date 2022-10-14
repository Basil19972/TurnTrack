package com.example.jwt.domain.excercise;


import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.excercise.dto.ExerciseMapper;
import com.example.jwt.domain.user.User;
import com.example.jwt.domain.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    /*
    @PostMapping()
    @PreAuthorize("hasAuthority('EXERCISE_WRITE')")
    public ResponseEntity<ExerciseDTO> createExercise(@RequestBody ExerciseDTO exerciseDTO) {
        return new ResponseEntity<>(exerciseMapper.toDTO(exerciseService.create(exerciseMapper.fromDTO(exerciseDTO))), HttpStatus.CREATED);
    }
     */

    @PostMapping("/{setNumber}")
    @PreAuthorize("hasAuthority('EXERCISE_WRITE')")
    public ResponseEntity<ExerciseDTO> createExercise(@PathVariable int setNumber, @RequestBody ExerciseDTO exerciseDTO) {
        return new ResponseEntity<>(exerciseMapper.toDTO(exerciseService.create(exerciseMapper.fromDTO(exerciseDTO),setNumber)), HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('EXERCISE_WRITE')")
    public ResponseEntity<ExerciseDTO> updateById(@PathVariable UUID id, @Validated @RequestBody ExerciseDTO exerciseDTO) {
        return new ResponseEntity<>(exerciseMapper.toDTO(exerciseService.updateById(id,exerciseMapper.fromDTO(exerciseDTO))), HttpStatus.OK);
    }

    @GetMapping("")
    @PreAuthorize("hasAuthority('EXERCISE_READ')")
    public ResponseEntity<List<ExerciseDTO>> findAll() {
        List<ExerciseDTO> exerciseDTOS = exerciseMapper.toDTOs(exerciseService.findAll());
        return new ResponseEntity<>(exerciseDTOS, HttpStatus.OK);
    }


}
