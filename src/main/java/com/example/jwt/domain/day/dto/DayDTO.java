package com.example.jwt.domain.day.dto;

import com.example.jwt.core.generic.ExtendedDTO;


public class DayDTO extends ExtendedDTO {

    private String name;

    public DayDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DayDTO() {
    }
}
