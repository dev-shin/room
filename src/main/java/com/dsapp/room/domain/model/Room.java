package com.dsapp.room.domain.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    String roomId;
    @Length(max=1000)
    String title;
    @Length(max=4000)
    String memo;
    String address;
    String deposit;
    String rent;
    String roomFloor;
    String buildingFloor;
    String ho;
    String movingDate;
    String roomType;
    String roomSize;
    String animal;
    String loan;
    String parking;
    String elevator;
    @Length(max=1000)
    String roomOptions;
    @Length(max=4000)
    String photos;
    String location;
    @Length(max=1000)
    String safeties;
    String agentName;
    String agentUserName;
    String agentUserPhone;
    String agentUserTel;
    @Length(max=1000)
    String linkUrl;
    String destination;
    @CreationTimestamp
    LocalDateTime createdDate;
    String regDate;
    Boolean isFavorite;
    Boolean isDeleted;

}