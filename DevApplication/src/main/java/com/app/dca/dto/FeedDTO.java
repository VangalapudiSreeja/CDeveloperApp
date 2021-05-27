package com.app.dca.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


import com.app.dca.entity.Developer;
import com.app.dca.entity.FeedResponse;

public class FeedDTO {
	
	private int feedId;
	private String queryQ;
	private LocalDate feedDate;
	private LocalTime feedTime;
	private String topic;	// Programming/Java/Testing
	private int relevance;// Likes on Feed increase relevance, write custom query
	private Developer dev;
	private int totalComments;
	public FeedDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedDTO(int feedId, String queryQ, LocalDate feedDate, LocalTime feedTime, String topic, int relevance,
			Developer dev, int totalComments) {
		super();
		this.feedId = feedId;
		this.queryQ = queryQ;
		this.feedDate = feedDate;
		this.feedTime = feedTime;
		this.topic = topic;
		this.relevance = relevance;
		this.dev = dev;
		this.totalComments = totalComments;
	}
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	public String getQueryQ() {
		return queryQ;
	}
	public void setQueryQ(String queryQ) {
		this.queryQ = queryQ;
	}
	public LocalDate getFeedDate() {
		return feedDate;
	}
	public void setFeedDate(LocalDate feedDate) {
		this.feedDate = feedDate;
	}
	public LocalTime getFeedTime() {
		return feedTime;
	}
	public void setFeedTime(LocalTime feedTime) {
		this.feedTime = feedTime;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getRelevance() {
		return relevance;
	}
	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}
	public Developer getDev() {
		return dev;
	}
	public void setDev(Developer dev) {
		this.dev = dev;
	}
	public int getTotalComments() {
		return totalComments;
	}
	public void setTotalComments(int totalComments) {
		this.totalComments = totalComments;
	}
	
	

}
