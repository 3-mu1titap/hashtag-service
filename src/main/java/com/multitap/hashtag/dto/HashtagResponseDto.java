package com.multitap.hashtag.dto;

import com.multitap.hashtag.entity.Hashtag;
import com.multitap.hashtag.vo.HashtagResponseVo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HashtagResponseDto {

    private String hashtagName;
    private Long hashtagId;

    @Builder
    public HashtagResponseDto(String hashtagName, Long hashtagId) {
        this.hashtagName = hashtagName;
        this.hashtagId = hashtagId;
    }

    public static HashtagResponseDto from(Hashtag hashtag) {
        return HashtagResponseDto.builder()
                .hashtagName(hashtag.getName())
                .hashtagId(hashtag.getId())
                .build();
    }

    public static HashtagResponseVo toVo(HashtagResponseDto hashtagResponseDto) {
        return HashtagResponseVo.builder()
                .hashtagName(hashtagResponseDto.getHashtagName())
                .hashtagId(hashtagResponseDto.getHashtagId())
                .build();
    }

}
