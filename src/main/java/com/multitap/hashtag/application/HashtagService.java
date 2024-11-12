package com.multitap.hashtag.application;


import com.multitap.hashtag.dto.HashtagRequestDto;
import com.multitap.hashtag.dto.HashtagResponseDto;

import java.util.List;

public interface HashtagService {

    void addHashtag(HashtagRequestDto hashtagRequestDto);
    List<HashtagResponseDto> getHashtag();
}
