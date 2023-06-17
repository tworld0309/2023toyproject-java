package com.hotel.serverapi.data.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@IdClass(TbAdminId.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@EntityListeners(AuditingEntityListener.class)
@ToString
@Getter
@Entity
@Table(name = "TB_ADMIN", schema = "hotel")
public class TbAdminEntity {
    @Id
    @Column(name = "admin_id")
    private String adminId;

    @Id
    @Column(name = "admin_hotel_id")
    private String adminHotelId;

    @Column(name = "admin_password")
    private String adminPassword;

    @Column(name = "admin_nm")
    private String adminNm;

    @Column(name = "admin_role_cd")
    private String adminRoleCd;

    @Column(name = "admin_email")
    private String adminEmail;

    @Column(name = "admin_phone")
    private String adminPhone;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "reg_dt")
    private LocalDate regDt;

    @Column(name = "mod_id")
    private String modId;

    @Column(name = "mod_dt")
    private LocalDate modDt;

}