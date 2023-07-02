package com.hotel.serverapi.data.repository;

import com.hotel.serverapi.data.entity.TbHotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<TbHotelEntity, String> {
}
