package com.boot3.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbAdminEntity is a Querydsl query type for TbAdminEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbAdminEntity extends EntityPathBase<TbAdminEntity> {

    private static final long serialVersionUID = -194182909L;

    public static final QTbAdminEntity tbAdminEntity = new QTbAdminEntity("tbAdminEntity");

    public final StringPath adminEmail = createString("adminEmail");

    public final StringPath adminHotelId = createString("adminHotelId");

    public final StringPath adminId = createString("adminId");

    public final StringPath adminNm = createString("adminNm");

    public final StringPath adminPassword = createString("adminPassword");

    public final StringPath adminPhone = createString("adminPhone");

    public final StringPath adminRoleCd = createString("adminRoleCd");

    public final DatePath<java.time.LocalDate> modDt = createDate("modDt", java.time.LocalDate.class);

    public final StringPath modId = createString("modId");

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final StringPath regId = createString("regId");

    public QTbAdminEntity(String variable) {
        super(TbAdminEntity.class, forVariable(variable));
    }

    public QTbAdminEntity(Path<? extends TbAdminEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbAdminEntity(PathMetadata metadata) {
        super(TbAdminEntity.class, metadata);
    }

}

