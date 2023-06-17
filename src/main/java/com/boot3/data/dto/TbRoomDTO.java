package com.boot3.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TbRoomDTO {
    private String hotelCd;
    private String roomCd;
    private String roomNm;
    private Integer roomFloor;
    private String roomGradeCd;
    private String roomViewCd;
    private Integer roomMaxAccomdate;
    private Integer roomBasicAccomdate;
    private Integer roomPrice;
    private Integer roomExtraPrice;
    private Integer roomSize;
    private String roomSmokeYn;
    private String roomBathYn;
    private String regId;
    private LocalDate regDt;
    private String modId;
    private LocalDate modDt;

}
