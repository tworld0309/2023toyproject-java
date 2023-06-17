package com.boot3.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbHotelEntity is a Querydsl query type for TbHotelEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbHotelEntity extends EntityPathBase<TbHotelEntity> {

    private static final long serialVersionUID = -1973182552L;

    public static final QTbHotelEntity tbHotelEntity = new QTbHotelEntity("tbHotelEntity");

    public final StringPath hotelAddress = createString("hotelAddress");

    public final StringPath hotelAddress2 = createString("hotelAddress2");

    public final StringPath hotelCd = createString("hotelCd");

    public final StringPath hotelCityCd = createString("hotelCityCd");

    public final DatePath<java.time.LocalDate> hotelEstablishDt = createDate("hotelEstablishDt", java.time.LocalDate.class);

    public final StringPath hotelGradeCd = createString("hotelGradeCd");

    public final StringPath hotelNationCd = createString("hotelNationCd");

    public final StringPath hotelNm = createString("hotelNm");

    public final StringPath hotelPhone = createString("hotelPhone");

    public final StringPath hotelZipcode = createString("hotelZipcode");

    public final DatePath<java.time.LocalDate> modDt = createDate("modDt", java.time.LocalDate.class);

    public final StringPath modId = createString("modId");

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final StringPath regId = createString("regId");

    public final StringPath tourInfo = createString("tourInfo");

    public QTbHotelEntity(String variable) {
        super(TbHotelEntity.class, forVariable(variable));
    }

    public QTbHotelEntity(Path<? extends TbHotelEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbHotelEntity(PathMetadata metadata) {
        super(TbHotelEntity.class, metadata);
    }

}

