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
@Table(name = "TB_CM_DT_CODE", schema = "hotel")
public class TbCmDtCodeEntity {
    @ManyToOne
    @JoinColumn(name = "code")
    private String code;

    @Id
    @Column(name = "dt_code")
    private String dtCode;

    @Column(name = "dt_name")
    private String dtName;

    @Column(name = "dt_desc")
    private String dtDesc;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "reg_dt")
    private LocalDate regDt;

    @Column(name = "mod_id")
    private String modId;

    @Column(name = "mod_dt")
    private LocalDate modDt;

}
