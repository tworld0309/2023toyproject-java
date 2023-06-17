package com.boot3.data.mapstruct;

import com.boot3.data.dto.request.UserRequestDto;
import com.boot3.data.entity.TbUserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-17T16:10:19+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public List<UserRequestDto> toDtoList(List<TbUserEntity> entityList) {
        if ( entityList == null ) {
            return new ArrayList<UserRequestDto>();
        }

        List<UserRequestDto> list = new ArrayList<UserRequestDto>( entityList.size() );
        for ( TbUserEntity tbUserEntity : entityList ) {
            list.add( tbUserEntityToUserRequestDto( tbUserEntity ) );
        }

        return list;
    }

    protected UserRequestDto tbUserEntityToUserRequestDto(TbUserEntity tbUserEntity) {

        UserRequestDto userRequestDto = new UserRequestDto();

        if ( tbUserEntity != null ) {
            userRequestDto.setCustId( tbUserEntity.getCustId() );
        }

        return userRequestDto;
    }
}
