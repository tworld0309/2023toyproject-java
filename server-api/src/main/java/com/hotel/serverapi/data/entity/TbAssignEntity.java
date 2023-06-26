package com.hotel.serverapi.data.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
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

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private TbReservationEntity reservationId;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="room_cd"),
            @JoinColumn(name="hotel_cd")
    })
    private TbRoomEntity tbRoomEntity;

    @Column(name = "payment_dt")
    private LocalDate paymentDt;

    @Column(name = "payment_cd")
    private String paymentCd;

    @Column(name = "payment_price")
    private Integer paymentPrice;

    @Column(name = "invoice")
    private String invoice;

    @Column(name = "checkout_usage_price")
    private Integer checkoutUsagePrice;

    @Column(name = "final_return_price")
    private Integer finalReturnPrice;

    @Column(name = "status_cd")
    private String statusCd;

    @Column(name = "checkin_dt")
    private LocalDate checkinDt;

    @Column(name = "real_checkin_dt")
    private LocalDate realCheckinDt;

    @Column(name = "real_checkin_admin_id")
    private String realCheckinAdminId;

    @Column(name = "checkout_dt")
    private LocalDate checkoutDt;

    @Column(name = "real_checkout_dt")
    private LocalDate realCheckoutDt;

    @Column(name = "real_checkout_admin_id")
    private String realCheckoutAdminId;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "reg_dt")
    @CreatedDate
    private LocalDate regDt;

    @Column(name = "mod_id")
    private String modId;

    @Column(name = "mod_dt")
    @LastModifiedDate
    private LocalDate modDt;

}
