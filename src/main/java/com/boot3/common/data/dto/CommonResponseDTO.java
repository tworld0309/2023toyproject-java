package com.boot3.common.data.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CommonResponseDTO<T> {

    private String code;
    private String message;
    private T data;

    public static <T> CommonResponseDTO of(T data) {
        return CommonResponseDTO.builder()
                .code(ResCode.SUCCESS.getCode())
                .message(ResCode.SUCCESS.getMessage())
                .data(data)
                .build();
    }

    public static <T> CommonResponseDTO of(T data, ResCode resCode) {
        return CommonResponseDTO.builder()
                .code(resCode.getCode())
                .message(resCode.getMessage())
                .data(data)
                .build();
    }

    public static <T> CommonResponseDTO of(ResCode resCode) {
        return CommonResponseDTO.builder()
                .code(resCode.getCode())
                .message(resCode.getMessage())
                .build();
    }

}
