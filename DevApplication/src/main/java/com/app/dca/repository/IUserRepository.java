package com.app.dca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.dca.entity.UserD;


public interface IUserRepository{
	
	UserD login(UserD user);
	
	UserD logout(UserD user);
}