package com.example.jwt.domain.trainingDone;


import com.example.jwt.domain.planCategory.PlanCategoryService;
import com.example.jwt.domain.planCategory.dto.PlanCategoryMapper;
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
@RequestMapping("/trainingdone")
public class TrainingDoneController {




}
