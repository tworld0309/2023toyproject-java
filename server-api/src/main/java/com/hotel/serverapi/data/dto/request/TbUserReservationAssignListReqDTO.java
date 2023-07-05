package com.hotel.serverapi.data.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TbUserReservationAssignListReqDTO {
    private String reservationId;
}
