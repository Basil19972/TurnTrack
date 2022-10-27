package com.example.jwt.domain.weekDay;


import com.example.jwt.domain.excercise.ExerciseService;
import com.example.jwt.domain.excercise.dto.ExerciseDTO;
import com.example.jwt.domain.excercise.dto.ExerciseMapper;
import com.example.jwt.domain.trainingSet.dto.TrainingSetDTO;
import com.example.jwt.domain.weekDay.dto.WeekDayDTO;
import com.example.jwt.domain.weekDay.dto.WeekDayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

@Validated
@RestController
@RequestMapping("/weekday")
public class WeekDayController {


    private final WeekDayService weekDayService;
    private final WeekDayMapper weekDayMapper;

    @Autowired
    public WeekDayController(WeekDayService weekDayService, WeekDayMapper weekDayMapper) {
        this.weekDayService = weekDayService;
        this.weekDayMapper = weekDayMapper;
    }



    @GetMapping("")
    @PreAuthorize("hasAuthority('WEEKDAY_READ')")
    public ResponseEntity<List<WeekDayDTO>> findAll() {


        List<WeekDayDTO> weekDayDTOS = weekDayMapper.toDTOs(weekDayService.findAll());
        return new ResponseEntity<>(weekDayDTOS, HttpStatus.OK);
    }

    @PostMapping()
    @PreAuthorize("hasAuthority('WEEKDAY_WRITE')")
    public ResponseEntity<WeekDayDTO> createExercise(@RequestBody WeekDayDTO weekDayDTO) {
        return new ResponseEntity<>(weekDayMapper.toDTO(weekDayService.create(weekDayMapper.fromDTO(weekDayDTO))), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('WEEKDAY_WRITE')")
    public ResponseEntity<WeekDayDTO> updateByToDoneId(@PathVariable UUID id) {
        return new ResponseEntity<>(weekDayMapper.toDTO(weekDayService.updateToDoneById(id)), HttpStatus.OK);
    }




}
