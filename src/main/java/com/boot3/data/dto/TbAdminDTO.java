package com.boot3.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TbAdminDTO {
    private String adminId;
    private String adminHotelId;
    private String adminPassword;
    private String adminNm;
    private String adminRoleCd;
    private String adminEmail;
    private String adminPhone;
    private String regId;
    private LocalDate regDt;
    private String modId;
    private LocalDate modDt;
}
