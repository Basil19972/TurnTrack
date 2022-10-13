package com.example.jwt.domain.userWeightHistory.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import java.sql.Date;

public class UserWeightHistoryDTO extends ExtendedDTO {

    private Double weight;

    public UserWeightHistoryDTO(Double weight) {
        this.weight = weight;
    }

    public UserWeightHistoryDTO() {
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
