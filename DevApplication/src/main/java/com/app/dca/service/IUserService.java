package com.app.dca.service;

import com.app.dca.entity.UserD;

public interface IUserService {
	
	UserD login(UserD user);
	
	UserD logout(UserD user);
}
