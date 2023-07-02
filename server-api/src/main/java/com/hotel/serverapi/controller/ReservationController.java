package com.hotel.serverapi.controller;

import com.hotel.serverapi.data.dto.TbHotelDTO;
import com.hotel.serverapi.service.ReservationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reservation")
@Tag(name="Reservation Controller")
public class ReservationController {
    private final ReservationService reservationService;

    @GetMapping("/hotels")
    @Operation(description = "등록된 전체 호텔 조회하기")
    public List<TbHotelDTO> hotelList() { return reservationService.geHotelList();}
}
