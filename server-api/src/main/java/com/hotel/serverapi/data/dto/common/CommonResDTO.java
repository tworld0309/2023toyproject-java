package com.hotel.serverapi.data.dto.common;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
@Builder
public class CommonResDTO {

    private String code;
    private String message;
    private List<?> list;

    public static CommonResDTO of(List<?> data) {
        return CommonResDTO.builder()
                .code(ResCode.SUCCESS.getCode())
                .message(ResCode.SUCCESS.getMessage())
                .list(data)
                .build();
    }

    public static CommonResDTO of(List<?> data, ResCode resCode) {
        return CommonResDTO.builder()
                .code(resCode.getCode())
                .message(resCode.getMessage())
                .list(data)
                .build();
    }

    public static CommonResDTO of(ResCode resCode) {
        return CommonResDTO.builder()
                .code(resCode.getCode())
                .message(resCode.getMessage())
                .build();
    }

}
