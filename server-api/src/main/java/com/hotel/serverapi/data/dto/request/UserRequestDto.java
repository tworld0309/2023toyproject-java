package com.hotel.serverapi.data.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRequestDto {
    private String custId;

    @Builder
    public UserRequestDto(String custId) {
        this.custId = custId;
    }

    static public UserRequestDto of(String custId) {
        return UserRequestDto.builder()
                .custId(custId)
                .build();
    }
}
