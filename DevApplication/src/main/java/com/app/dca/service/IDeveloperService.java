package com.app.dca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.dca.entity.Developer;
import com.app.dca.exception.UnknownDeveloperException;


public interface IDeveloperService {

	Developer addDeveloper(Developer dev);
	
	Developer editDeveloper(Developer dev);
	
	Developer statusUpdate(Developer dev);	// Block/Unblock
	
	Developer getDeveloper(int devId) throws UnknownDeveloperException;
	
	List<Developer> getAllDevelopers();
}
