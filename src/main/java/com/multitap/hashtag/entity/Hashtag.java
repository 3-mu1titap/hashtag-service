package com.multitap.hashtag.entity;

import com.multitap.hashtag.common.response.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Hashtag extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer orderNumber;

    @Builder
    public Hashtag(Long id, String name, Integer orderNumber) {
        this.id = id;
        this.name = name;
        this.orderNumber = orderNumber;
    }
}
