package com.boot3.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbUserEntity is a Querydsl query type for TbUserEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbUserEntity extends EntityPathBase<TbUserEntity> {

    private static final long serialVersionUID = -869830531L;

    public static final QTbUserEntity tbUserEntity = new QTbUserEntity("tbUserEntity");

    public final StringPath custAddress = createString("custAddress");

    public final StringPath custAddress2 = createString("custAddress2");

    public final DatePath<java.time.LocalDate> custBirthDt = createDate("custBirthDt", java.time.LocalDate.class);

    public final StringPath custEmail = createString("custEmail");

    public final StringPath custGradeCd = createString("custGradeCd");

    public final StringPath custId = createString("custId");

    public final StringPath custNm = createString("custNm");

    public final StringPath custPassport = createString("custPassport");

    public final StringPath custPassword = createString("custPassword");

    public final DatePath<java.time.LocalDate> custPasswordValidDt = createDate("custPasswordValidDt", java.time.LocalDate.class);

    public final StringPath custPhone = createString("custPhone");

    public final StringPath custTypeCd = createString("custTypeCd");

    public final StringPath custZipcode = createString("custZipcode");

    public final DatePath<java.time.LocalDate> modDt = createDate("modDt", java.time.LocalDate.class);

    public final StringPath modId = createString("modId");

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final StringPath regId = createString("regId");

    public QTbUserEntity(String variable) {
        super(TbUserEntity.class, forVariable(variable));
    }

    public QTbUserEntity(Path<? extends TbUserEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbUserEntity(PathMetadata metadata) {
        super(TbUserEntity.class, metadata);
    }

}

