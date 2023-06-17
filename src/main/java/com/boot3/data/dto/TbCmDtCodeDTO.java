package com.boot3.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TbCmDtCodeDTO {
    private String code;
    private String dtCode;
    private String dtName;
    private String dtDesc;
    private String regId;
    private LocalDate regDt;
    private String modId;
    private LocalDate modDt;
}
