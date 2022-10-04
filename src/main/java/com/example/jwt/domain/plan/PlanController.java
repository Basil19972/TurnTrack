package com.example.jwt.domain.plan;


import com.example.jwt.domain.plan.dto.PlanDTO;
import com.example.jwt.domain.plan.dto.PlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Validated
@RestController
@RequestMapping("/plan")
public class PlanController {


    private final PlanService planService;
    private final PlanMapper planMapper;

    @Autowired
    public PlanController(PlanService planService, PlanMapper planMapper) {
        this.planService = planService;
        this.planMapper = planMapper;
    }




    @PostMapping()
    @PreAuthorize("hasAuthority('PLAN_WRITE')")
    public ResponseEntity<PlanDTO> createPlan(@RequestBody PlanDTO planDTO) {
        return new ResponseEntity<>(planMapper.toDTO(planService.createPlan(planMapper.fromDTO(planDTO))), HttpStatus.CREATED);
    }




}
