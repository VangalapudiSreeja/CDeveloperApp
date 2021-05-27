package com.app.dca.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.dca.entity.Feed;

public class CustomFeedRepositoryImpl implements CustomFeedRepository {

	@Autowired
	EntityManager entityManager;

	@Override
	public List<Feed> getFeedsByTopic(String feedTopic) {
		
		Query q = entityManager.createQuery("from Feed where topic=:feedTopic");
		q.setParameter("feedTopic", feedTopic);
		return q.getResultList();
	}
	

}
