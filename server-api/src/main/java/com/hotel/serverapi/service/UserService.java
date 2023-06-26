package com.hotel.serverapi.service;


import com.hotel.serverapi.data.dto.request.UserGradeReqSaveDto;
import com.hotel.serverapi.data.dto.request.UserReqDto;
import com.hotel.serverapi.data.dto.response.TbUserGradeResDTO;
import com.hotel.serverapi.data.dto.response.TbUserResDTO;
import com.hotel.serverapi.data.mapstruct.UserMapper;
import com.hotel.serverapi.data.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    /**
     * Method :  getUserList
     * Description : 고객 목록 조회
     **/
    public List<TbUserResDTO> getUserList() {
        return UserMapper.INSTANCE.toDtoList(userRepository.findAll());
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
//
//    public UserDTO userInfoByQuerydsl(UserRecordReqDTO dto) {
//        return userRepository.userInfoByQuerydsl(dto);
//    }
//
//    public List<UserRecordDTO> getUserList() {
//        return UserMapper.INSTANCE.toDtoList(userRepository.findAll());
//    }
//
//    public void saveUserInfo(UserSaveReqDTO dto) {
//        UserEntity userEntity = UserMapper.INSTANCE.toEntity(dto);
//
//        userRepository.save(userEntity);
//    }
//
//    // 임시 데이터 생성하기
//    public void saveTestUser() {
//
//        for (int i = 0; i < 10; i++){
//            UserEntity newData = new UserEntity("temp_"+i, "temp_"+i+"@naver.com", "temp_"+i, "temp_"+i, LocalDateTime.of(2023, 2, i+1, 12, 12, 12));
//            userRepository.save(newData);
//        }
//    }
}
