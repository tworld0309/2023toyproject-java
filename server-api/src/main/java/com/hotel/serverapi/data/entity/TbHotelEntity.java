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
@Table(name = "TB_HOTEL", schema = "hotel")
public class TbHotelEntity {
    @Id
    @Column(name = "hotel_cd")
    private String hotelCd;

    @Column(name = "hotel_nm")
    private String hotelNm;

    @Column(name = "hotel_grade_cd")
    private String hotelGradeCd;

    @Column(name = "hotel_address")
    private String hotelAddress;

    @Column(name = "hotel_address2")
    private String hotelAddress2;

    @Column(name = "hotel_zipcode")
    private String hotelZipcode;

    @Column(name = "hotel_phone")
    private String hotelPhone;


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
