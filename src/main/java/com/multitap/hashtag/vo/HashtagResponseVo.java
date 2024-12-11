package com.multitap.hashtag.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HashtagResponseVo {
//
    private String hashtagName;
    private Long hashtagId;

    @Builder
    public HashtagResponseVo(String hashtagName, Long hashtagId) {
        this.hashtagName = hashtagName;
        this.hashtagId = hashtagId;
    }
}
