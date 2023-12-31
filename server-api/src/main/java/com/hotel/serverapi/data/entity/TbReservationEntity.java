package com.hotel.serverapi.data.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;


@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@EntityListeners(AuditingEntityListener.class)
@ToString
@Getter
@Entity
@Table(name = "TB_RESERVATION", schema = "hotel")
public class TbReservationEntity {
    @Id
    @Column(name = "reservation_id")
    private String reservationId;

    @Column(name = "cust_id")
    private String custId;

    @Column(name = "hotel_cd")
    private String hotelCd;

    @Column(name = "room_grade_cd")
    private String roomGradeCd;

    @Column(name = "payment_dt")
    private LocalDate paymentDt;

    @Column(name = "payment_cd")
    private String paymentCd;

    @Column(name = "payment_price")
    private Integer paymentPrice;

    @Column(name = "invoice")
    private String invoice;

    @Column(name = "special_request")
    private String specialRequest;

    @Column(name = "vaild_yn")
    private String vaildYn;

    @Column(name = "status_cd")
    private String statusCd;

    @Column(name = "reg_id")
    @CreatedBy
    private String regId;

    @Column(name = "reg_dt")
    @CreatedDate
    private LocalDate regDt;

    @Column(name = "mod_id")
    @LastModifiedBy
    private String modId;

    @Column(name = "mod_dt")
    @LastModifiedDate
    private LocalDate modDt;

}
