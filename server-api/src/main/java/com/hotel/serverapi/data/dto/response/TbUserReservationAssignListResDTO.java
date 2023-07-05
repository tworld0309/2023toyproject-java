package com.hotel.serverapi.data.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TbUserReservationAssignListResDTO {
    private String reservationId;
    private String custId;
    private String custNm;
    private String hotelCd;
    private String roomGradeCd;
    private String paymentCd;
    private LocalDate paymentDt;
    private Integer paymentPrice;
    private String invoice;
    private String specialRequest;
    private String vaildYn;
    private String statusCd;
    private String regId;
    private LocalDate regDt;
    private String modId;
    private LocalDate modDt;

}
