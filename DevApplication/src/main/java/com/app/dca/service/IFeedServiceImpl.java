package com.app.dca.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dca.entity.Developer;
import com.app.dca.entity.Feed;
import com.app.dca.exception.UnknownDeveloperException;
import com.app.dca.exception.UnknownFeedException;
import com.app.dca.repository.FeedRepository;
import com.app.dca.repository.IDeveloperRepository;
import com.app.dca.repository.IFeedRepository;
import com.app.dca.exception.UnknownFeedException;

@Service
public class IFeedServiceImpl implements IFeedService{

	@Autowired
	private FeedRepository repo;
	
	@Autowired
	private IDeveloperService devServcie;
	
	@Override
	@Transactional
	public Feed addFeed(Feed feed){
		return repo.save(feed);
	}

	@Override
	public Feed editFeed(Feed feed) {
		
		return repo.save(feed);
	}

	@Override
	public Feed likeFeed(int feedId){
		Feed f =  repo.findById(feedId).get();
		f.setRelevance(f.getRelevance()+1);
		return f;
	}

	@Override
	public Feed getFeed(int feedId) throws UnknownFeedException{
		Feed f = repo.findById(feedId).get();
		if(f == null) {
		 throw new UnknownFeedException();
		}

		return repo.findById(feedId).get();
	}

	@Override
	public Feed removeFeed(int feedId) throws UnknownFeedException {
		Optional<Feed> f = repo.findById(feedId);
		Feed del = repo.findById(feedId).get();
		if(f.isEmpty()){
			 throw new UnknownFeedException();
			}
		else
			repo.deleteById(feedId);
		return del;
	}

	@Override
	public List<Feed> getFeedsByDeveloper(int devId) throws UnknownDeveloperException{
	    Developer d = devServcie.getDeveloper(devId);
		return d.getFeeds();
	}

	@Override
	public List<Feed> getFeedsByKeyword(String keyword) {
		
		return null;
	}

	@Override
	public List<Feed> getFeedsByTopic(String topic) {
		
	return repo.getFeedsByTopic(topic);
	}

}
