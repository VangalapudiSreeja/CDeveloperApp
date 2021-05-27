package com.app.dca.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpInc;
import org.springframework.stereotype.Service;

import com.app.dca.entity.Developer;
import com.app.dca.entity.Feed;
import com.app.dca.entity.FeedResponse;
import com.app.dca.exception.UnknownDeveloperException;
import com.app.dca.exception.UnknownFeedException;
import com.app.dca.exception.UnknownFeedResponseException;
import com.app.dca.repository.DeveloperRepository;
import com.app.dca.repository.FeedRepository;
import com.app.dca.repository.FeedResponseRepository;
import com.app.dca.repository.IFeedResponseRepository;

@Service
public class IFeedResponseServiceImpl implements IFeedResponseService {
	
	@Autowired
	private FeedResponseRepository repo;
	@Autowired
	private FeedRepository fr;
	@Autowired
	private DeveloperRepository dr;
	
	
	@Override
	@Transactional
	public FeedResponse addResponse(FeedResponse resp) {
		
		repo.save(resp);
		return resp;
	}

	
	@Override
	public FeedResponse editResponse(FeedResponse resp, Integer id) {
		
		return repo.save(resp);
	}

	@Override
	public FeedResponse removeResponse(int respId) throws UnknownFeedResponseException {
		
		Optional<FeedResponse> resp = repo.findById(respId);
		FeedResponse del = repo.findById(respId).get();
		
		repo.deleteById(respId);
		return del;
		
	}

	@Override
	public FeedResponse likeResponse(int respId) {
		
		FeedResponse resp = repo.findById(respId).get();
		resp.setRelevance(resp.getRelevance()+1);
		return resp;
		
		
	}

	@Override
	public List<FeedResponse> getResponseByFeed(int feedId) throws UnknownFeedException {
		Feed f = fr.findById(feedId).get();
		
		return f.getResponses();
	}

	@Override
	public List<FeedResponse> getResponseByDeveloper(int devId) throws UnknownDeveloperException {
		Developer d = dr.findById(devId).get();
            
		return null;
	}


	@Override
	public FeedResponse editResponse(FeedResponse resp) {
		
		return repo.save(resp);
	}


	@Override
	public List<FeedResponse> getAllResponses() {

		return repo.findAll();
	}

} //end class