package com.multitap.hashtag.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HashtagResponseVo {

    private String name;
    private Long hashtagId;

    @Builder
    public HashtagResponseVo(String name, Long hashtagId) {
        this.name = name;
        this.hashtagId = hashtagId;
    }
}
