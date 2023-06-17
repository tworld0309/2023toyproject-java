package com.boot3.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbCmDtCodeEntity is a Querydsl query type for TbCmDtCodeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbCmDtCodeEntity extends EntityPathBase<TbCmDtCodeEntity> {

    private static final long serialVersionUID = 1316423641L;

    public static final QTbCmDtCodeEntity tbCmDtCodeEntity = new QTbCmDtCodeEntity("tbCmDtCodeEntity");

    public final StringPath code = createString("code");

    public final StringPath dtCode = createString("dtCode");

    public final StringPath dtDesc = createString("dtDesc");

    public final StringPath dtName = createString("dtName");

    public final DatePath<java.time.LocalDate> modDt = createDate("modDt", java.time.LocalDate.class);

    public final StringPath modId = createString("modId");

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final StringPath regId = createString("regId");

    public QTbCmDtCodeEntity(String variable) {
        super(TbCmDtCodeEntity.class, forVariable(variable));
    }

    public QTbCmDtCodeEntity(Path<? extends TbCmDtCodeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbCmDtCodeEntity(PathMetadata metadata) {
        super(TbCmDtCodeEntity.class, metadata);
    }

}

