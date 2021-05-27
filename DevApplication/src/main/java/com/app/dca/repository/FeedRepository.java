package com.app.dca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dca.entity.Developer;
import com.app.dca.entity.Feed;

public interface FeedRepository extends JpaRepository<Feed, Integer>,CustomFeedRepository {

}
