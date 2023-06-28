package com.hotel.serverapi.data.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserGradeReqSaveDto {
    private String custId;
    private String custGradeCd;

    @Builder
    public UserGradeReqSaveDto(String custId, String custGradeCd) {
        this.custId = custId;
        this.custGradeCd = custGradeCd;
    }

    static public UserGradeReqSaveDto of(String custId, String custGradeCd) {
        return UserGradeReqSaveDto.builder()
                .custId(custId)
                .custGradeCd(custGradeCd)
                .build();
    }
}
