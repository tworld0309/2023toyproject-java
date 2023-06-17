package com.boot3.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TbAssignDTO {
    private String assignId;
    private String reservationId;
    private String hotelCd;
    private String roomCd;
    private LocalDate paymentDt;
    private String paymentCd;
    private Integer paymentPrice;
    private String invoice;
    private Integer checkoutUsagePrice;
    private Integer finalReturnPrice;
    private String statusCd;
    private LocalDate checkinDt;
    private LocalDate realCheckinDt;
    private String realCheckinAdminId;
    private LocalDate checkoutDt;
    private LocalDate realCheckoutDt;
    private String realCheckoutAdminId;
    private String regId;
    private LocalDate regDt;
    private String modId;
    private LocalDate modDt;

}
