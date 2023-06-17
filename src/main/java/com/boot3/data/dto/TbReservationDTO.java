package com.boot3.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TbReservationDTO {
    private String reservationId;
    private String custId;
    private LocalDate paymentDt;
    private String paymentCd;
    private Integer paymentPrice;
    private String invoice;
    private String earlyCheckinYn;
    private String lateCheckoutYn;
    private String specialRequest;
    private String vaildYn;
    private String statusCd;
    private String userCancleYn;
    private String regId;
    private LocalDate regDt;
    private String modId;
    private LocalDate modDt;
}
