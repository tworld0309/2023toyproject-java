package com.boot3.data.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class TbAdminId implements Serializable {
    private String adminId;
    private String adminHotelId;

    public TbAdminId() {
    }

    public TbAdminId(String adminId, String adminHotelId) {
        this.adminId = adminId;
        this.adminHotelId = adminHotelId;
    }

}
