package com.example.jwt.domain.userWeightHistory.dto;

import com.example.jwt.core.generic.ExtendedDTO;

public class UserBMIDTO extends ExtendedDTO {

    private Double bmi;

    public UserBMIDTO(Double bmi) {
        this.bmi = bmi;
    }

    public UserBMIDTO() {
    }

    public Double getBmi() {
        return bmi;
    }

    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }
}
