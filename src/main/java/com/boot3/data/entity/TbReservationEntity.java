package com.boot3.data.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
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

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private String custId;

    @Column(name = "payment_dt")
    private LocalDate paymentDt;

    @Column(name = "payment_cd")
    private String paymentCd;

    @Column(name = "payment_price")
    private Integer paymentPrice;

    @Column(name = "invoice")
    private String invoice;

    @Column(name = "early_checkin_yn")
    private String earlyCheckinYn;

    @Column(name = "late_checkout_yn")
    private String lateCheckoutYn;

    @Column(name = "special_request")
    private String specialRequest;

    @Column(name = "vaild_yn")
    private String vaildYn;

    @Column(name = "status_cd")
    private String statusCd;

    @Column(name = "user_cancle_yn")
    private String userCancleYn;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "reg_dt")
    private LocalDate regDt;

    @Column(name = "mod_id")
    private String modId;

    @Column(name = "mod_dt")
    private LocalDate modDt;
}
