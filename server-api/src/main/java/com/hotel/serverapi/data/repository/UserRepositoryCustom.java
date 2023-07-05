package com.hotel.serverapi.data.repository;

import com.hotel.serverapi.data.dto.request.TbUserReservationAssignListReqDTO;
import com.hotel.serverapi.data.dto.request.UserGradeReqSaveDto;
import com.hotel.serverapi.data.dto.request.UserReqDto;
import com.hotel.serverapi.data.dto.response.TbUserGradeResDTO;
import com.hotel.serverapi.data.dto.response.TbUserResDTO;
import com.hotel.serverapi.data.dto.response.TbUserReservationAssignListResDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepositoryCustom {

    TbUserResDTO findByUserId(UserReqDto dto);
    TbUserGradeResDTO findGradeInfoByUserId(UserReqDto dto);

    void saveUserGradeInfo(UserGradeReqSaveDto dto);

    List<TbUserReservationAssignListResDTO> getUserReservationAssignList();

    TbUserReservationAssignListResDTO getUserReservationAssignInfo(TbUserReservationAssignListReqDTO dto);
}