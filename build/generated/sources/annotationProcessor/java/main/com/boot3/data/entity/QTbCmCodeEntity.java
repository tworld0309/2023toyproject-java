package com.boot3.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbCmCodeEntity is a Querydsl query type for TbCmCodeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbCmCodeEntity extends EntityPathBase<TbCmCodeEntity> {

    private static final long serialVersionUID = -1847329431L;

    public static final QTbCmCodeEntity tbCmCodeEntity = new QTbCmCodeEntity("tbCmCodeEntity");

    public final StringPath code = createString("code");

    public final StringPath description = createString("description");

    public final DatePath<java.time.LocalDate> modDt = createDate("modDt", java.time.LocalDate.class);

    public final StringPath modId = createString("modId");

    public final StringPath name = createString("name");

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final StringPath regId = createString("regId");

    public QTbCmCodeEntity(String variable) {
        super(TbCmCodeEntity.class, forVariable(variable));
    }

    public QTbCmCodeEntity(Path<? extends TbCmCodeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbCmCodeEntity(PathMetadata metadata) {
        super(TbCmCodeEntity.class, metadata);
    }

}

