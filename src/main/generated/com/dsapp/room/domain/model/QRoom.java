package com.dsapp.room.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoom is a Querydsl query type for Room
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRoom extends EntityPathBase<Room> {

    private static final long serialVersionUID = -1755694784L;

    public static final QRoom room = new QRoom("room");

    public final StringPath address = createString("address");

    public final StringPath agentName = createString("agentName");

    public final StringPath agentUserName = createString("agentUserName");

    public final StringPath agentUserPhone = createString("agentUserPhone");

    public final StringPath agentUserTel = createString("agentUserTel");

    public final StringPath animal = createString("animal");

    public final StringPath buildingFloor = createString("buildingFloor");

    public final DateTimePath<java.time.LocalDateTime> createdDate = createDateTime("createdDate", java.time.LocalDateTime.class);

    public final StringPath deposit = createString("deposit");

    public final StringPath destination = createString("destination");

    public final StringPath elevator = createString("elevator");

    public final StringPath ho = createString("ho");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isDeleted = createBoolean("isDeleted");

    public final BooleanPath isFavorite = createBoolean("isFavorite");

    public final StringPath linkUrl = createString("linkUrl");

    public final StringPath loan = createString("loan");

    public final StringPath location = createString("location");

    public final StringPath memo = createString("memo");

    public final StringPath movingDate = createString("movingDate");

    public final StringPath parking = createString("parking");

    public final StringPath photos = createString("photos");

    public final StringPath regDate = createString("regDate");

    public final StringPath rent = createString("rent");

    public final StringPath roomFloor = createString("roomFloor");

    public final StringPath roomId = createString("roomId");

    public final StringPath roomOptions = createString("roomOptions");

    public final StringPath roomType = createString("roomType");

    public final StringPath safeties = createString("safeties");

    public final StringPath size = createString("size");

    public final StringPath title = createString("title");

    public QRoom(String variable) {
        super(Room.class, forVariable(variable));
    }

    public QRoom(Path<? extends Room> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoom(PathMetadata metadata) {
        super(Room.class, metadata);
    }

}

