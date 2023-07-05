package com.hotel.serverapi.controller;

import com.hotel.serverapi.data.dto.common.CommonResDTO;
import com.hotel.serverapi.data.dto.request.UserGradeReqSaveDto;
import com.hotel.serverapi.data.dto.request.UserReqDto;
import com.hotel.serverapi.data.dto.response.TbUserGradeResDTO;
import com.hotel.serverapi.data.dto.response.TbUserResDTO;
import com.hotel.serverapi.service.UserService;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Tag(name="User Controller", description="User Controller 구현하기")
public class UserController {

    private final UserService userService;

    /**
     * Method :  getUserList
     * Description : 고객 목록 조회
     **/
    @GetMapping("/cust")
    @Hidden
    @Operation(description = "UserList 조회하기")
    public CommonResDTO userList(){
        return userService.getUserList();
    }

    /**
     * Method :  getUserInfo
     * Description : 고객 상세 정보 조회자
     **/
    @GetMapping("/cust/{userId}")
    @Operation(description = "특정 사용자 조회하기")
    public TbUserResDTO userInfo(@PathVariable String userId){

        UserReqDto dto = UserReqDto.of(userId);
        return userService.getUserInfo(dto);
    }

    /**
     * Method :  getUserGradeInfo
     * Description : 특정 사용자 등급 정보 조회
     **/
    @GetMapping("/cust/grade/{userId}")
    @Operation(description = "특정 사용자 등급 조회하기")
    public TbUserGradeResDTO getUserGradeInfo(@PathVariable String userId){

        UserReqDto dto = UserReqDto.of(userId);
        return userService.getUserGradeInfo(dto);
    }

    /**
     * Method :  saveUserGradeInfo
     * Description : 특정 사용자 등급 변경하기
     **/
    @PostMapping("/cust/grade")
    @Operation(description = "특정 사용자 등급 변경하기")
    public void saveUserGradeInfo(@Validated @RequestBody UserGradeReqSaveDto userGradeRequestSaveDto){
        userService.saveUserGradeInfo(userGradeRequestSaveDto);
    }

    /**
     * Method :  getUserReservationAssignList
     * Description : 예약한 호텔/객실 목록 조회
     **/
    @GetMapping("/user/reservation/assigns")
    @Operation(description = "예약한 호텔/객실 목록 조회")
    public CommonResDTO getUserReservationAssignList(){
        return userService.getUserReservationAssignList();
    }
}
