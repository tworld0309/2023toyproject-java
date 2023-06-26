package com.hotel.serverapi.data.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@EntityListeners(AuditingEntityListener.class)
@ToString
@Getter
@Entity
@Table(name = "TB_USER", schema = "hotel")
public class TbUserEntity {
    @Id
    @Column(name = "cust_id")
    private String custId;

    @OneToMany(fetch=FetchType.LAZY )
    @ToString.Exclude
    @Builder.Default
    private List<TbReservationEntity> child = new ArrayList<>();

    @Column(name = "cust_password")
    private String custPassword;

    @Column(name = "cust_email")
    private String custEmail;

    @Column(name = "cust_nm")
    private String custNm;

    @Column(name = "cust_birth_dt")
    private LocalDate custBirthDt;

    @Column(name = "cust_phone")
    private String custPhone;

    @Column(name = "cust_grade_cd")
    private String custGradeCd;

    @Column(name = "cust_grade_modi_dt")
    private LocalDate custGradeModiDt;

    @Column(name = "cust_grade_modi_admin")
    private String custGradeModiAdmin;

    @Column(name = "cust_type_cd")
    private String custTypeCd;

    @Column(name = "cust_passport")
    private String custPassport;

    @Column(name = "cust_password_valid_dt")
    private LocalDate custPasswordValidDt;

    @Column(name = "cust_address")
    private String custAddress;

    @Column(name = "cust_address2")
    private String custAddress2;

    @Column(name = "cust_zipcode")
    private String custZipcode;

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
