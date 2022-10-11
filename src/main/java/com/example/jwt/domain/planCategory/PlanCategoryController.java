package com.example.jwt.domain.planCategory;


import com.example.jwt.domain.planCategory.dto.PlanCategoryDTO;
import com.example.jwt.domain.planCategory.dto.PlanCategoryMapper;
import com.example.jwt.domain.weekDay.WeekDayService;
import com.example.jwt.domain.weekDay.dto.WeekDayDTO;
import com.example.jwt.domain.weekDay.dto.WeekDayMapper;
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
@RequestMapping("/plancategory")
public class PlanCategoryController {


    private final PlanCategoryService planCategoryService;
    private final PlanCategoryMapper planCategoryMapper;

    @Autowired

    public PlanCategoryController(PlanCategoryService planCategoryService, PlanCategoryMapper planCategoryMapper) {
        this.planCategoryService = planCategoryService;
        this.planCategoryMapper = planCategoryMapper;
    }



    @GetMapping("")
    @PreAuthorize("hasAuthority('PLAN_CATEGORY_READ')")
    public ResponseEntity<List<PlanCategoryDTO>> findAll() {
        List<PlanCategoryDTO> planCategoryDTOS = planCategoryMapper.toDTOs(planCategoryService.findAll());
        return new ResponseEntity<>(planCategoryDTOS, HttpStatus.OK);

    }




}
