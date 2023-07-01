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
@Table(name = "TB_ASSIGN", schema = "hotel")
public class TbAssignEntity {
    @Id
    @Column(name = "assign_id")
    private String assignId;

    @Column(name = "reservation_id")
    private String reservationId;

    @Column(name = "hotel_cd")
    private String hotelCd;

    @Column(name = "room_cd")
    private String roomCd;

    @Column(name = "status_cd")
    private String statusCd;

    @Column(name = "checkin_dt")
    private LocalDate checkinDt;

    @Column(name = "real_checkin_admin_id")
    private String realCheckinAdminId;

    @Column(name = "checkout_dt")
    private LocalDate checkoutDt;

    @Column(name = "real_checkout_admin_id")
    private String realCheckoutAdminId;


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
