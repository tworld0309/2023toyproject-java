package com.boot3.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbAssignEntity is a Querydsl query type for TbAssignEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbAssignEntity extends EntityPathBase<TbAssignEntity> {

    private static final long serialVersionUID = 1740839649L;

    public static final QTbAssignEntity tbAssignEntity = new QTbAssignEntity("tbAssignEntity");

    public final StringPath assignId = createString("assignId");

    public final DatePath<java.time.LocalDate> checkinDt = createDate("checkinDt", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> checkoutDt = createDate("checkoutDt", java.time.LocalDate.class);

    public final NumberPath<Integer> checkoutUsagePrice = createNumber("checkoutUsagePrice", Integer.class);

    public final NumberPath<Integer> finalReturnPrice = createNumber("finalReturnPrice", Integer.class);

    public final StringPath hotelCd = createString("hotelCd");

    public final StringPath invoice = createString("invoice");

    public final DatePath<java.time.LocalDate> modDt = createDate("modDt", java.time.LocalDate.class);

    public final StringPath modId = createString("modId");

    public final StringPath paymentCd = createString("paymentCd");

    public final DatePath<java.time.LocalDate> paymentDt = createDate("paymentDt", java.time.LocalDate.class);

    public final NumberPath<Integer> paymentPrice = createNumber("paymentPrice", Integer.class);

    public final StringPath realCheckinAdminId = createString("realCheckinAdminId");

    public final DatePath<java.time.LocalDate> realCheckinDt = createDate("realCheckinDt", java.time.LocalDate.class);

    public final StringPath realCheckoutAdminId = createString("realCheckoutAdminId");

    public final DatePath<java.time.LocalDate> realCheckoutDt = createDate("realCheckoutDt", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final StringPath regId = createString("regId");

    public final StringPath reservationId = createString("reservationId");

    public final StringPath roomCd = createString("roomCd");

    public final StringPath statusCd = createString("statusCd");

    public QTbAssignEntity(String variable) {
        super(TbAssignEntity.class, forVariable(variable));
    }

    public QTbAssignEntity(Path<? extends TbAssignEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbAssignEntity(PathMetadata metadata) {
        super(TbAssignEntity.class, metadata);
    }

}

