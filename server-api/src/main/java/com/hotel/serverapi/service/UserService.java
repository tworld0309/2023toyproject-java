package com.hotel.serverapi.service;


import com.hotel.serverapi.data.dto.common.CommonResDTO;
import com.hotel.serverapi.data.dto.request.TbUserReservationAssignListReqDTO;
import com.hotel.serverapi.data.dto.request.UserGradeReqSaveDto;
import com.hotel.serverapi.data.dto.request.UserReqDto;
import com.hotel.serverapi.data.dto.response.TbUserGradeResDTO;
import com.hotel.serverapi.data.dto.response.TbUserResDTO;
import com.hotel.serverapi.data.dto.response.TbUserReservationAssignListResDTO;
import com.hotel.serverapi.data.mapstruct.UserMapper;
import com.hotel.serverapi.data.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    /**
     * Method :  getUserList
     * Description : 고객 목록 조회
     **/
    public CommonResDTO getUserList() {
        return CommonResDTO.of(UserMapper.INSTANCE.toDtoList(userRepository.findAll()));
    }


    /**
     * Method :  getUserInfo
     * Description : 특정 고객 정보 조회
     **/
    public TbUserResDTO getUserInfo(UserReqDto dto) {
        return userRepository.findByUserId(dto);
    }

    /**
     * Method :  getUserGradeInfo
     * Description : 고객 등급 정보 조회
     **/
    public TbUserGradeResDTO getUserGradeInfo(UserReqDto dto) {
        return userRepository.findGradeInfoByUserId(dto);
    }

    /**
     * Method :  saveUserGradeInfo
     * Description : 고객 등급 변경하기
     **/
    public void saveUserGradeInfo(UserGradeReqSaveDto dto) {
        userRepository.saveUserGradeInfo(dto);
    }

    /**
     * Method :  getUserReservationAssignList
     * Description : 예약한 호텔/객실 목록 조회
     **/
    public CommonResDTO getUserReservationAssignList() {
        return CommonResDTO.of(userRepository.getUserReservationAssignList());
    }

    /**
     * Method :  getUserReservationAssignInfo
     * Description : 예약한 호텔/객실 상세 정보 조회
     **/
    public TbUserReservationAssignListResDTO getUserReservationAssignInfo(TbUserReservationAssignListReqDTO dto) {
        return userRepository.getUserReservationAssignInfo(dto);
    }
}
