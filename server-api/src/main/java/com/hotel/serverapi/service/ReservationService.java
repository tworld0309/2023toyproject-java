package com.hotel.serverapi.service;

import com.hotel.serverapi.data.dto.TbHotelDTO;
import com.hotel.serverapi.data.mapstruct.HotelMapper;
import com.hotel.serverapi.data.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final HotelRepository hotelRepository;

    public List<TbHotelDTO> geHotelList(){
        return HotelMapper.INSTANCE.toDtoList(hotelRepository.findAll());
    }
}
