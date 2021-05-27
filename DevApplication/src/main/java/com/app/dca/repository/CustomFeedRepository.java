package com.app.dca.repository;

import java.util.List;

import com.app.dca.entity.Feed;

public interface CustomFeedRepository {
   public List<Feed> getFeedsByTopic(String topic);
}
