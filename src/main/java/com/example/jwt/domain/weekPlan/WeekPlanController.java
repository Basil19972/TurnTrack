package com.example.jwt.domain.weekPlan;


import com.example.jwt.domain.weekPlan.dto.WeekPlanDTO;
import com.example.jwt.domain.weekPlan.dto.WeekPlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/weekplan")
public class WeekPlanController {


    private final WeekPlanService weekPlanService;
    private final WeekPlanMapper weekPlanMapper;

    @Autowired
    public WeekPlanController(WeekPlanService weekPlanService, WeekPlanMapper weekPlanMapper) {
        this.weekPlanService = weekPlanService;
        this.weekPlanMapper = weekPlanMapper;
    }




    @PostMapping()
    @PreAuthorize("hasAuthority('WEEKPLAN_WRITE')")
    public ResponseEntity<WeekPlanDTO> createPlan(@RequestBody WeekPlanDTO weekPlanDTO) {
        return new ResponseEntity<>(weekPlanMapper.toDTO(weekPlanService.createPlan(weekPlanMapper.fromDTO(weekPlanDTO))), HttpStatus.CREATED);
    }




}
