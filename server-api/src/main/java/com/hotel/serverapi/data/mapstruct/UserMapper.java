package com.hotel.serverapi.data.mapstruct;

import com.boot3.data.dto.request.UserRequestDto;
import com.boot3.data.entity.TbUserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);


//    @Mapping(target="pwd", expression="java(entity.getEncryptedPwd())")
//    UserRecordDTO toDto(TbUserEntity entity);



//    @Mapping(target="encryptedPwd", expression="java(dto.getPwd())")
//    @Mapping(target="createdDate", expression="java(java.time.LocalDateTime.now())")
//    TbUserEntity toEntity(UserSaveReqDTO dto);


    List<UserRequestDto> toDtoList(List<TbUserEntity> entityList);

    //List<TbUserEntity> toEntityList(List<UserSaveReqDTO> dtoList);


}