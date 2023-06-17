package com.boot3.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbReservationEntity is a Querydsl query type for TbReservationEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbReservationEntity extends EntityPathBase<TbReservationEntity> {

    private static final long serialVersionUID = 1447687936L;

    public static final QTbReservationEntity tbReservationEntity = new QTbReservationEntity("tbReservationEntity");

    public final StringPath custId = createString("custId");

    public final StringPath earlyCheckinYn = createString("earlyCheckinYn");

    public final StringPath invoice = createString("invoice");

    public final StringPath lateCheckoutYn = createString("lateCheckoutYn");

    public final DatePath<java.time.LocalDate> modDt = createDate("modDt", java.time.LocalDate.class);

    public final StringPath modId = createString("modId");

    public final StringPath paymentCd = createString("paymentCd");

    public final DatePath<java.time.LocalDate> paymentDt = createDate("paymentDt", java.time.LocalDate.class);

    public final NumberPath<Integer> paymentPrice = createNumber("paymentPrice", Integer.class);

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final StringPath regId = createString("regId");

    public final StringPath reservationId = createString("reservationId");

    public final StringPath specialRequest = createString("specialRequest");

    public final StringPath statusCd = createString("statusCd");

    public final StringPath userCancleYn = createString("userCancleYn");

    public final StringPath vaildYn = createString("vaildYn");

    public QTbReservationEntity(String variable) {
        super(TbReservationEntity.class, forVariable(variable));
    }

    public QTbReservationEntity(Path<? extends TbReservationEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbReservationEntity(PathMetadata metadata) {
        super(TbReservationEntity.class, metadata);
    }

}

