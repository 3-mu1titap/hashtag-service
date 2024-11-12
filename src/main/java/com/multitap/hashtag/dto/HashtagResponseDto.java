package com.multitap.hashtag.dto;

import com.multitap.hashtag.entity.Hashtag;
import com.multitap.hashtag.vo.HashtagResponseVo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HashtagResponseDto {

    private String name;
    private Long hashtagId;

    @Builder
    public HashtagResponseDto(String name, Long hashtagId) {
        this.name = name;
        this.hashtagId = hashtagId;
    }

    public static HashtagResponseDto from(Hashtag hashtag) {
        return HashtagResponseDto.builder()
                .name(hashtag.getName())
                .hashtagId(hashtag.getId())
                .build();
    }

    public static HashtagResponseVo toVo(HashtagResponseDto hashtagResponseDto) {
        return HashtagResponseVo.builder()
                .name(hashtagResponseDto.getName())
                .hashtagId(hashtagResponseDto.getHashtagId())
                .build();
    }

}
