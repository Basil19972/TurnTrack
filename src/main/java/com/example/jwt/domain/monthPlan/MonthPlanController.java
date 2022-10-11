package com.example.jwt.domain.monthPlan;


import com.example.jwt.domain.monthPlan.dto.MonthPlanDTO;
import com.example.jwt.domain.monthPlan.dto.MonthPlanMapper;
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
@RequestMapping("/weekplan")
public class MonthPlanController {


    private final MonthPlanService monthPlanService;
    private final MonthPlanMapper monthPlanMapper;

    @Autowired
    public MonthPlanController(MonthPlanService monthPlanService, MonthPlanMapper monthPlanMapper) {
        this.monthPlanService = monthPlanService;
        this.monthPlanMapper = monthPlanMapper;
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




}
