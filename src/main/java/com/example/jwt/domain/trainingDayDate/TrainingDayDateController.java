package com.example.jwt.domain.trainingDayDate;


import com.example.jwt.domain.trainingDayDate.dto.TrainingDayDateDTO;
import com.example.jwt.domain.trainingDayDate.dto.TrainingDayDateMapper;
import com.example.jwt.domain.weekDay.dto.WeekDayDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping("/trainingdaydate")
public class TrainingDayDateController {


    private final TrainingDayDateService trainingDayDateService;
    private final TrainingDayDateMapper trainingDayDateMapper;

    @Autowired
    public TrainingDayDateController(TrainingDayDateService trainingDayDateService, TrainingDayDateMapper trainingDayDateMapper) {
        this.trainingDayDateService = trainingDayDateService;
        this.trainingDayDateMapper = trainingDayDateMapper;
    }



/*
    @PostMapping()
    @PreAuthorize("hasAuthority('PLAN_WRITE')")
    public ResponseEntity<MonthPlanDTO> createPlan(@RequestBody MonthPlanDTO monthPlanDTO) {

        monthPlanDTO.getExercises().forEach(exerciseDTO -> System.out.println(exerciseDTO.getName()));
        monthPlanDTO.getExercises().forEach(excercise -> System.out.println(excercise.getTrainingSets()));

        return new ResponseEntity<>(monthPlanMapper.toDTO(monthPlanService.createPlan(monthPlanMapper.fromDTO(monthPlanDTO))), HttpStatus.CREATED);
    }

 */

    @GetMapping("")
    @PreAuthorize("hasAuthority('WEEKDAY_READ')")
    public ResponseEntity<List<TrainingDayDateDTO>> findAll() {

        List<TrainingDayDateDTO> trainingDayDateDTOS = trainingDayDateMapper.toDTOs(trainingDayDateService.findAll());
        return new ResponseEntity<>(trainingDayDateDTOS, HttpStatus.OK);
    }




}
