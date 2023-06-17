package com.boot3.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TbUserDTO {
    private String custId;
    private String custPassword;
    private String custEmail;
    private String custNm;
    private LocalDate custBirthDt;
    private String custPhone;
    private String custGradeCd;
    private String custTypeCd;
    private String custPassport;
    private LocalDate custPasswordValidDt;
    private String custAddress;
    private String custAddress2;
    private String custZipcode;
    private String regId;
    private LocalDate regDt;
    private String modId;
    private LocalDate modDt;

}
