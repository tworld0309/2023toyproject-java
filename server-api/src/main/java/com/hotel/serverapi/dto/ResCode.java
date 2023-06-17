package com.hotel.serverapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResCode {
	SUCCESS("200", "Success"),
	ERR_PARAMETER("400", "Invalid Parameter"),
	ERR_NETWORK("450", "Check your network"),
	ERR_SYSTEM("500", "Internal Server Error");

	private final String code;
	private final String message;
}
