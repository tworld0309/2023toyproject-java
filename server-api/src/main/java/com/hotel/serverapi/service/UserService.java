package com.hotel.serverapi.service;


import com.boot3.data.dto.request.UserRequestDto;
import com.boot3.data.mapstruct.UserMapper;
import com.boot3.data.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserRequestDto> getUserList() {
        return UserMapper.INSTANCE.toDtoList(userRepository.findAll());
    }

//    public UserRecordDTO getUserInfo(UserRecordReqDTO dto) {
//        return UserMapper.INSTANCE.toDto(userRepository.findByUserId(dto.userId()));
//    }
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
