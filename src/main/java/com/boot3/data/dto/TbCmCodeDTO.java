package com.boot3.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter  @Setter
public class TbCmCodeDTO {
    private String code;
    private String name;
    private String description;
    private String regId;
    private LocalDate regDt;
    private String modId;
    private LocalDate modDt;

}
