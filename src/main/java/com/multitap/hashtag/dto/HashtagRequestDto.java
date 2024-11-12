package com.multitap.hashtag.dto;

import com.multitap.hashtag.entity.Hashtag;
import com.multitap.hashtag.vo.HashtagRequestVo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HashtagRequestDto {
    private String name;
    private Integer order;

    @Builder
    public HashtagRequestDto(String name, Integer order) {
        this.name = name;
        this.order = order;
    }

    public static HashtagRequestDto from(HashtagRequestVo hashtagRequestVo) {
        return HashtagRequestDto.builder()
                .name(hashtagRequestVo.getName())
                .order(hashtagRequestVo.getOrder())
                .build();
    }

    public Hashtag toEntity(HashtagRequestDto hashtagRequestDto) {
        return Hashtag.builder()
                .name(hashtagRequestDto.getName())
                .orderNumber(hashtagRequestDto.getOrder())
                .build();
    }

}
