package com.boot3.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbRoomEntity is a Querydsl query type for TbRoomEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbRoomEntity extends EntityPathBase<TbRoomEntity> {

    private static final long serialVersionUID = -1534723699L;

    public static final QTbRoomEntity tbRoomEntity = new QTbRoomEntity("tbRoomEntity");

    public final StringPath hotelCd = createString("hotelCd");

    public final DatePath<java.time.LocalDate> modDt = createDate("modDt", java.time.LocalDate.class);

    public final StringPath modId = createString("modId");

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final StringPath regId = createString("regId");

    public final NumberPath<Integer> roomBasicAccomdate = createNumber("roomBasicAccomdate", Integer.class);

    public final StringPath roomBathYn = createString("roomBathYn");

    public final StringPath roomCd = createString("roomCd");

    public final NumberPath<Integer> roomExtraPrice = createNumber("roomExtraPrice", Integer.class);

    public final NumberPath<Integer> roomFloor = createNumber("roomFloor", Integer.class);

    public final StringPath roomGradeCd = createString("roomGradeCd");

    public final NumberPath<Integer> roomMaxAccomdate = createNumber("roomMaxAccomdate", Integer.class);

    public final StringPath roomNm = createString("roomNm");

    public final NumberPath<Integer> roomPrice = createNumber("roomPrice", Integer.class);

    public final NumberPath<Integer> roomSize = createNumber("roomSize", Integer.class);

    public final StringPath roomSmokeYn = createString("roomSmokeYn");

    public final StringPath roomViewCd = createString("roomViewCd");

    public QTbRoomEntity(String variable) {
        super(TbRoomEntity.class, forVariable(variable));
    }

    public QTbRoomEntity(Path<? extends TbRoomEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbRoomEntity(PathMetadata metadata) {
        super(TbRoomEntity.class, metadata);
    }

}

