package com.app.dca.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dca.entity.FeedResponse;

public interface FeedResponseRepository extends JpaRepository<FeedResponse, Integer> {

}
