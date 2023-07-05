package com.hotel.serverapi.data.repository;

import com.hotel.serverapi.data.dto.request.UserGradeReqSaveDto;
import com.hotel.serverapi.data.dto.request.UserReqDto;
import com.hotel.serverapi.data.dto.response.TbUserGradeResDTO;
import com.hotel.serverapi.data.dto.response.TbUserResDTO;
import com.hotel.serverapi.data.dto.response.TbUserReservationAssignListResDTO;
import com.hotel.serverapi.data.entity.QTbReservationEntity;
import com.hotel.serverapi.data.entity.QTbUserEntity;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;

    /**
     * Method :  getUserInfo
     * Description : 특정 고객 정보 조회
     **/
    @Override
    public TbUserResDTO findByUserId(UserReqDto dto) {

        return jpaQueryFactory.select(Projections.fields(TbUserResDTO.class
                                , QTbUserEntity.tbUserEntity.custId.as("custId")
                                , QTbUserEntity.tbUserEntity.custEmail.as("custEmail")
                                , QTbUserEntity.tbUserEntity.custNm.as("custNm")
                                , QTbUserEntity.tbUserEntity.custBirthDt.as("custBirthDt")
                                , QTbUserEntity.tbUserEntity.custPhone.as("custPhone")
                        )
                )
                .from(QTbUserEntity.tbUserEntity)
                .where(QTbUserEntity.tbUserEntity.custId.eq(dto.getCustId()))
                .fetchOne()
                ;
    }

    /**
     * Method :  getUserGradeInfo
     * Description : 고객 등급 정보 조회
     **/
    @Override
    public TbUserGradeResDTO findGradeInfoByUserId(UserReqDto dto) {
        return jpaQueryFactory.select(Projections.fields(TbUserGradeResDTO.class
                                , QTbUserEntity.tbUserEntity.custId.as("custId")
                                , QTbUserEntity.tbUserEntity.custNm.as("custNm")
                                , QTbUserEntity.tbUserEntity.custGradeCd.as("custGradeCd")
                                , QTbUserEntity.tbUserEntity.custTypeCd.as("custTypeCd")
                                , QTbUserEntity.tbUserEntity.regId.as("regId")
                                , QTbUserEntity.tbUserEntity.regDt.as("regDt")
                                , QTbUserEntity.tbUserEntity.modId.as("modId")
                                , QTbUserEntity.tbUserEntity.modDt.as("modDt")
                        )
                )
                .from(QTbUserEntity.tbUserEntity)
                .where(QTbUserEntity.tbUserEntity.custId.eq(dto.getCustId()))
                .fetchOne()
                ;
    }

    /**
     * Method :  saveUserGradeInfo
     * Description : 고객 등급 변경하기
     **/
    @Override
    public void saveUserGradeInfo(UserGradeReqSaveDto dto){
        jpaQueryFactory.update(QTbUserEntity.tbUserEntity)
                .set(QTbUserEntity.tbUserEntity.custGradeCd, dto.getCustGradeCd())
                .where(QTbUserEntity.tbUserEntity.custId.eq(dto.getCustId()))
                .execute();
        ;
    }

    /**
     * Method :  getUserReservationAssignList
     * Description : 예약한 호텔/객실 목록 조회
     **/
    @Override
    public List<TbUserReservationAssignListResDTO> getUserReservationAssignList() {
        return jpaQueryFactory.select(Projections.fields(TbUserReservationAssignListResDTO.class
                        , QTbReservationEntity.tbReservationEntity.reservationId.as("reservationId")
                        , QTbReservationEntity.tbReservationEntity.custId.as("custId")
                        , QTbUserEntity.tbUserEntity.custNm.as("custNm")
                        , QTbReservationEntity.tbReservationEntity.hotelCd.as("hotelCd")
                        , QTbReservationEntity.tbReservationEntity.roomGradeCd.as("roomGradeCd")
                        , QTbReservationEntity.tbReservationEntity.paymentCd.as("paymentCd")
                        , QTbReservationEntity.tbReservationEntity.paymentDt.as("paymentDt")
                        , QTbReservationEntity.tbReservationEntity.paymentPrice.as("paymentPrice")
                        , QTbReservationEntity.tbReservationEntity.invoice.as("invoice")
                        , QTbReservationEntity.tbReservationEntity.specialRequest.as("specialRequest")
                        , QTbReservationEntity.tbReservationEntity.vaildYn.as("vaildYn")
                        , QTbReservationEntity.tbReservationEntity.statusCd.as("statusCd")
                        , QTbReservationEntity.tbReservationEntity.regId.as("regId")
                        , QTbReservationEntity.tbReservationEntity.regDt.as("regDt")
                        , QTbReservationEntity.tbReservationEntity.modId.as("modId")
                        , QTbReservationEntity.tbReservationEntity.modDt.as("modDt")
                        )
                )
                .from(QTbReservationEntity.tbReservationEntity)
                .leftJoin(QTbUserEntity.tbUserEntity).on(QTbUserEntity.tbUserEntity.custId.eq(QTbReservationEntity.tbReservationEntity.custId)).fetchJoin()
                .fetch()
                ;
    }
}