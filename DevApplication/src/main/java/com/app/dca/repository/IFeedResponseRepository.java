package com.app.dca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.dca.entity.FeedResponse;
import com.app.dca.exception.UnknownDeveloperException;
import com.app.dca.exception.UnknownFeedException;
import com.app.dca.exception.UnknownFeedResponseException;


public interface IFeedResponseRepository{
	
	FeedResponse saveResponse(FeedResponse resp);
	
	FeedResponse updateResponse(FeedResponse resp);
	
	FeedResponse removeResponse(int respId) throws UnknownFeedResponseException;
	
	FeedResponse likeResponse(int respId);
	
	List<FeedResponse> fetchResponseByFeed(int feedId) throws UnknownFeedException;
	
	List<FeedResponse> fetchResponseByDeveloper(int devId) throws UnknownDeveloperException;
	
	
}