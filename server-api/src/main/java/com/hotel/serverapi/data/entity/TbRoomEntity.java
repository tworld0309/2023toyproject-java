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
@Table(name = "TB_ROOM", schema = "hotel")
public class TbRoomEntity {
    @Id
    @Column(name = "hotel_cd")
    private String hotelCd;

    @Id
    @Column(name = "room_cd")
    private String roomCd;

    @Column(name = "room_nm")
    private String roomNm;

    @Column(name = "room_status_cd")
    private String roomStatusCd;

    @Column(name = "room_floor")
    private Integer roomFloor;

    @Column(name = "room_grade_cd")
    private String roomGradeCd;


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
