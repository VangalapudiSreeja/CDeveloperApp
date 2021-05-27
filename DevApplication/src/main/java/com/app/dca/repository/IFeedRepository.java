package com.app.dca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.dca.entity.Feed;
import com.app.dca.exception.UnknownDeveloperException;
import com.app.dca.exception.UnknownFeedException;

@Repository
public interface IFeedRepository{

	Feed saveFeed(Feed feed);
	
	Feed updateFeed(Feed feed);
	
	Feed likeFeed(int feedId);
	
	Feed fetchFeed(int feedId) throws UnknownFeedException;
	
	Feed deleteFeed(int feedId) throws UnknownFeedException;
	
	List<Feed> fetchFeedsByDeveloper(int devId) throws UnknownDeveloperException;
	
	List<Feed> fetchFeedsByKeyword(String keyword);
	
	List<Feed> fetchFeedsByTopic(String topic);
}