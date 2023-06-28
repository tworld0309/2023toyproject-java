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
@Table(name = "TB_CM_CODE", schema = "hotel")
public class TbCmCodeEntity {
    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

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
