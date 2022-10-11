package com.example.jwt.domain.weekPlan;


import com.example.jwt.domain.weekPlan.dto.PlanDTO;
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
    @PreAuthorize("hasAuthority('PLAN_WRITE')")
    public ResponseEntity<PlanDTO> createPlan(@RequestBody PlanDTO planDTO) {

        return new ResponseEntity<>(weekPlanMapper.toDTO(weekPlanService.createPlan(weekPlanMapper.fromDTO(planDTO))), HttpStatus.CREATED);
    }




}
