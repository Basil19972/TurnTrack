package com.example.jwt.domain.userWeightHistory;


import com.example.jwt.domain.userWeightHistory.dto.UserBMIDTO;
import com.example.jwt.domain.userWeightHistory.dto.UserWeightHistoryDTO;
import com.example.jwt.domain.userWeightHistory.dto.UserWeightHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/userWeightHistory")
public class UserWeightHistoryController {


    private final UserWeightHistoryService userWeightHistoryService;
    private final UserWeightHistoryMapper userWeightHistoryMapper;

    @Autowired
    public UserWeightHistoryController(UserWeightHistoryService userWeightHistoryService, UserWeightHistoryMapper userWeightHistoryMapper) {
        this.userWeightHistoryService = userWeightHistoryService;
        this.userWeightHistoryMapper = userWeightHistoryMapper;
    }


    @PostMapping()
    @PreAuthorize("hasAuthority('USER_WEIGHT_HISTORY_WRITE')")
    public ResponseEntity<UserWeightHistoryDTO> createUserWeightHistory(@RequestBody UserWeightHistoryDTO userWeightHistoryDTO) {
        return new ResponseEntity<>(userWeightHistoryMapper.toDTO(userWeightHistoryService.save(userWeightHistoryMapper.fromDTO(userWeightHistoryDTO))), HttpStatus.CREATED);
    }


    @GetMapping("BMI")
    @PreAuthorize("hasAuthority('USER_BMI_READ')")
    public ResponseEntity<UserBMIDTO> findBMIByUser() {
        return new ResponseEntity<>(userWeightHistoryService.getBMIByUser(), HttpStatus.OK);
    }






}
