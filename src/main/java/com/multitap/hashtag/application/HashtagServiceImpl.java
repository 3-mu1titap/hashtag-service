package com.multitap.hashtag.application;

import com.multitap.hashtag.dto.HashtagRequestDto;
import com.multitap.hashtag.dto.HashtagResponseDto;
import com.multitap.hashtag.infrastructure.HashtagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HashtagServiceImpl implements HashtagService {

    private final HashtagRepository hashtagRepository;

    @Override
    public void addHashtag(HashtagRequestDto hashtagRequestDto) {

        hashtagRepository.save(hashtagRequestDto.toEntity(hashtagRequestDto));
    }

    @Override
    public List<HashtagResponseDto> getHashtag() {
        return hashtagRepository.findAllByOrderByOrderNumberAsc()
                .stream()
                .map(HashtagResponseDto::from)
                .toList();
    }
}
