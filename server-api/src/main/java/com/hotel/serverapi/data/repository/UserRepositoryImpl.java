package com.hotel.serverapi.data.repository;

import com.hotel.serverapi.data.dto.request.UserRequestDto;
import com.hotel.serverapi.data.dto.response.TbUserResponseDTO;
import com.hotel.serverapi.data.entity.QTbUserEntity;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public TbUserResponseDTO findByUserId(UserRequestDto dto) {

        return jpaQueryFactory.select(Projections.fields(TbUserResponseDTO.class
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
}