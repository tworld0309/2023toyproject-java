package com.hotel.serverapi.data.repository;

import com.hotel.serverapi.data.dto.request.UserRequestDto;
import com.hotel.serverapi.data.dto.response.TbUserResponseDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryCustom {

    TbUserResponseDTO findByUserId(UserRequestDto dto);
}