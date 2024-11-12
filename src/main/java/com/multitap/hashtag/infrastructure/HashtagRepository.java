package com.multitap.hashtag.infrastructure;

import com.multitap.hashtag.entity.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HashtagRepository extends JpaRepository<Hashtag, Long> {
    List<Hashtag> findAllByOrderByOrderNumberAsc();
}
