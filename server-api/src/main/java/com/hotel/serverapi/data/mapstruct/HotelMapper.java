package com.hotel.serverapi.data.mapstruct;

import com.hotel.serverapi.data.dto.TbHotelDTO;
import com.hotel.serverapi.data.entity.TbHotelEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface HotelMapper {
    HotelMapper INSTANCE = Mappers.getMapper(HotelMapper.class);

    List<TbHotelDTO> toDtoList(List<TbHotelEntity> entityList);
}
