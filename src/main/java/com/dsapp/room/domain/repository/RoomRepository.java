package com.dsapp.room.domain.repository;

import com.dsapp.room.domain.model.QRoom;
import com.dsapp.room.domain.model.Room;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends PagingAndSortingRepository<Room, Long>,
                                        QuerydslPredicateExecutor<Room>,
                                        QuerydslBinderCustomizer<QRoom> {
    @Override
    default void customize(QuerydslBindings bindings, QRoom root){
        bindings.bind(root.roomType).first((path, value) -> {
                if(value.equals("Single")){
                    return root.title.notLike("%불가%")
                            .and(root.title.notLike("%안됨%"))
                            .and(root.title.notLike("%안됩%"))
                            .and(root.address.contains("서울"))
                            .and(root.address.contains("성동")
                                    .or(root.address.contains("동대문"))
                                    .or(root.address.contains("광진"))
                                    .or(root.address.contains("강남"))
                                    .or(root.address.contains("송파"))
                                    .or(root.address.contains("용산"))
                            )
                            .and(root.isDeleted.isNull());
//                    return root.roomFloor.trim().eq("1")
//                            .and(root.buildingFloor.trim().eq("1"))
//                            .and(root.isDeleted.isNull().or(root.isDeleted.eq(false)))
//                            .or(root.address.contains("건물전체").and(root.isDeleted.isNull().or(root.isDeleted.eq(false))))
//                            .or(root.address.contains("건물 전체").and(root.isDeleted.isNull().or(root.isDeleted.eq(false))))
//                            .and(root.photos.length().gt(10))
//                            ;
                }else if(value.equals("Duplex")) {
                    return root.title.notLike("%불가%")
                            .and(root.title.notLike("%안됨%"))
                            .and(root.title.notLike("%안됩%"))
                            .and(root.isDeleted.isNull());

//                            root.buildingFloor.trim().eq("2")
//                            .or(root.buildingFloor.trim().eq("3"))
//                            //.or(root.buildingFloor.trim().eq("4"))
//                            .or(root.buildingFloor.trim().eq("-"))
//                            .and(root.memo.contains("복층").or(root.title.contains("복층")).or(root.title.contains("전원주택").or(root.memo.contains("전원주택")))
//                                    .or(root.title.contains("땅콩")).or(root.memo.contains("땅콩")).or(root.title.contains("협소주택")).or(root.memo.contains("협소주택"))
//                                    .or(root.title.contains("타운하우스")).or(root.memo.contains("타운하우스"))
//                            )
//
//                            .and(root.address.contains("서울").or(root.address.contains("수원")).or(root.address.contains("용인")).or(root.address.contains("성남")).or(root.address.contains("광주")))
//                            .and(root.isDeleted.isNull().or(root.isDeleted.eq(false)))
//                            .and(root.photos.length().gt(10))
//                            ;
                }else if(value.equals("Favorite")){
                    return root.isFavorite.eq(true).and(root.isDeleted.isNull().or(root.isDeleted.eq(false)));
                }else{
                    return root.roomType.contains(value);
                }
        });
    }
}
