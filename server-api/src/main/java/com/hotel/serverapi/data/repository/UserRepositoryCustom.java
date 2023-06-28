package com.hotel.serverapi.data.repository;

import com.hotel.serverapi.data.dto.request.UserGradeReqSaveDto;
import com.hotel.serverapi.data.dto.request.UserReqDto;
import com.hotel.serverapi.data.dto.response.TbUserGradeResDTO;
import com.hotel.serverapi.data.dto.response.TbUserResDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryCustom {

    TbUserResDTO findByUserId(UserReqDto dto);
    TbUserGradeResDTO findGradeInfoByUserId(UserReqDto dto);

    void saveUserGradeInfo(UserGradeReqSaveDto dto);
}