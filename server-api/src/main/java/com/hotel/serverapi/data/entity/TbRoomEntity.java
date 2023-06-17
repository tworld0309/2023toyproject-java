package com.hotel.serverapi.data.entity;

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
@IdClass(TbRoomId.class)
@Table(name = "TB_ROOM", schema = "hotel")
public class TbRoomEntity {
    @Id
    @ManyToOne
    @JoinColumn(name = "hotel_cd")
    private String hotelCd;

    @Id
    @Column(name = "room_cd")
    private String roomCd;

    @Column(name = "room_nm")
    private String roomNm;

    @Column(name = "room_floor")
    private Integer roomFloor;

    @Column(name = "room_grade_cd")
    private String roomGradeCd;

    @Column(name = "room_view_cd")
    private String roomViewCd;

    @Column(name = "room_max_accomdate")
    private Integer roomMaxAccomdate;

    @Column(name = "room_basic_accomdate")
    private Integer roomBasicAccomdate;

    @Column(name = "room_price")
    private Integer roomPrice;

    @Column(name = "room_extra_price")
    private Integer roomExtraPrice;

    @Column(name = "room_size")
    private Integer roomSize;

    @Column(name = "room_smoke_yn")
    private String roomSmokeYn;

    @Column(name = "room_bath_yn")
    private String roomBathYn;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "reg_dt")
    private LocalDate regDt;

    @Column(name = "mod_id")
    private String modId;

    @Column(name = "mod_dt")
    private LocalDate modDt;

}
