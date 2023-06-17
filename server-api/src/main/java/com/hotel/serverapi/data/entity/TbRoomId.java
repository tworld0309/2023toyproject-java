package com.hotel.serverapi.data.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class TbRoomId implements Serializable {
    private String hotelCd;
    private String roomCd;

    public TbRoomId() {
    }

    public TbRoomId(String hotelCd, String roomCd) {
        this.hotelCd = hotelCd;
        this.roomCd = roomCd;
    }
}

