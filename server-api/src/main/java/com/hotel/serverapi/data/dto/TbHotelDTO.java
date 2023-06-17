package com.hotel.serverapi.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TbHotelDTO {
    private String hotelCd;
    private String hotelNm;
    private String hotelGradeCd;
    private LocalDate hotelEstablishDt;
    private String hotelNationCd;
    private String hotelCityCd;
    private String tourInfo;
    private String hotelAddress;
    private String hotelAddress2;
    private String hotelZipcode;
    private String hotelPhone;
    private String regId;
    private LocalDate regDt;
    private String modId;
    private LocalDate modDt;
}
