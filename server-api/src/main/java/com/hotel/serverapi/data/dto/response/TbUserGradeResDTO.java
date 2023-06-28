package com.hotel.serverapi.data.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TbUserGradeResDTO {
    private String custId;
    private String custNm;
    private String custGradeCd;
    private String custTypeCd;
    // 최근 등급 변경일 추가 필요 (230626)
    private String regId;
    private LocalDate regDt;
    private String modId;
    private LocalDate modDt;

}
