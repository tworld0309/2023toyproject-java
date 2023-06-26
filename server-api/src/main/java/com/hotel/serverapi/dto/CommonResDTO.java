package com.hotel.serverapi.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CommonResDTO<T> {

    private String code;
    private String message;
    private T data;

    public static <T> CommonResDTO of(T data) {
        return CommonResDTO.builder()
                .code(ResCode.SUCCESS.getCode())
                .message(ResCode.SUCCESS.getMessage())
                .data(data)
                .build();
    }

    public static <T> CommonResDTO of(T data, ResCode resCode) {
        return CommonResDTO.builder()
                .code(resCode.getCode())
                .message(resCode.getMessage())
                .data(data)
                .build();
    }

    public static <T> CommonResDTO of(ResCode resCode) {
        return CommonResDTO.builder()
                .code(resCode.getCode())
                .message(resCode.getMessage())
                .build();
    }

}
