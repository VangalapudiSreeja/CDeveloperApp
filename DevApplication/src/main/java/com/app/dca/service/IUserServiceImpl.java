package com.app.dca.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dca.entity.UserD;
import com.app.dca.repository.IUserRepository;
import com.app.dca.repository.UserRepository;

@Service
public class IUserServiceImpl implements IUserService{
	
	@Autowired
	private UserRepository repo;
	@Override
	@Transactional
	public UserD login(UserD user) {
		// TODO Auto-generated method stub
		repo.save(user);
		return user;
	}

	@Override
	public UserD logout(UserD user) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserRepository getRepo() {
		return repo;
	}

	public void setRepu(UserRepository repo) {
		this.repo = repo;
	}
}