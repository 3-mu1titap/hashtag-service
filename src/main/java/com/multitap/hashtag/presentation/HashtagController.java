package com.multitap.hashtag.presentation;

import com.multitap.hashtag.application.HashtagService;
import com.multitap.hashtag.common.response.BaseResponse;
import com.multitap.hashtag.dto.HashtagRequestDto;
import com.multitap.hashtag.dto.HashtagResponseDto;
import com.multitap.hashtag.vo.HashtagRequestVo;
import com.multitap.hashtag.vo.HashtagResponseVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "해시태그 관리 API", description = "해시태그 관련 API endpoints")
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/admin")
public class HashtagController {

    private final HashtagService hashtagService;

    //todo: 해시태그, 피드백, 리뷰 키워드 등록 할 지 고민중
    @Operation(summary = "해시태그 등록", description = "해시태그를 등록합니다")
    @PostMapping("/hashtag")
    public BaseResponse<Void> addHashtag(@RequestBody HashtagRequestVo hashtagRequestVo) {
        hashtagService.addHashtag(HashtagRequestDto.from(hashtagRequestVo));
        return new BaseResponse<>();
    }

    @Operation(summary = "해시태그 조회", description = "해시태그 목록을 조회합니다.")
    @GetMapping("/hashtag")
    public BaseResponse<List<HashtagResponseVo>> getHashtag() {
        List<HashtagResponseVo> hashtagResponseVoList = hashtagService.getHashtag()
                .stream()
                .map(HashtagResponseDto::toVo)
                .toList();

        return new BaseResponse<>(hashtagResponseVoList);
    }


}
