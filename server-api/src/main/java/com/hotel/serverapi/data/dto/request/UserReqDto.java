package com.hotel.serverapi.data.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserReqDto {
    private String custId;

    @Builder
    public UserReqDto(String custId) {
        this.custId = custId;
    }

    static public UserReqDto of(String custId) {
        return UserReqDto.builder()
                .custId(custId)
                .build();
    }
}
