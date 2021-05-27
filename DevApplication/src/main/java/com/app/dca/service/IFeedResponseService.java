package com.app.dca.service;

import java.util.List;

import com.app.dca.entity.FeedResponse;
import com.app.dca.exception.UnknownDeveloperException;
import com.app.dca.exception.UnknownFeedException;
import com.app.dca.exception.UnknownFeedResponseException;

public interface IFeedResponseService {
	
	FeedResponse addResponse(FeedResponse resp);
	
	FeedResponse editResponse(FeedResponse resp);
	
	FeedResponse removeResponse(int respId) throws UnknownFeedResponseException;
	
	FeedResponse likeResponse(int respId);
	
	List<FeedResponse> getResponseByFeed(int feedId) throws UnknownFeedException;
	
	List<FeedResponse> getResponseByDeveloper(int devId) throws UnknownDeveloperException;

	FeedResponse editResponse(FeedResponse resp, Integer id);

	List<FeedResponse> getAllResponses();
	
}