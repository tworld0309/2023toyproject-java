package com.boot3.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbPriceEntity is a Querydsl query type for TbPriceEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbPriceEntity extends EntityPathBase<TbPriceEntity> {

    private static final long serialVersionUID = 1835453309L;

    public static final QTbPriceEntity tbPriceEntity = new QTbPriceEntity("tbPriceEntity");

    public final StringPath itemCd = createString("itemCd");

    public final DatePath<java.time.LocalDate> modDt = createDate("modDt", java.time.LocalDate.class);

    public final StringPath modId = createString("modId");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final DatePath<java.time.LocalDate> regDt = createDate("regDt", java.time.LocalDate.class);

    public final StringPath regId = createString("regId");

    public QTbPriceEntity(String variable) {
        super(TbPriceEntity.class, forVariable(variable));
    }

    public QTbPriceEntity(Path<? extends TbPriceEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbPriceEntity(PathMetadata metadata) {
        super(TbPriceEntity.class, metadata);
    }

}

