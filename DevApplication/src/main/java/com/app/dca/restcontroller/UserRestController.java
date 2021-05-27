package com.app.dca.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dca.service.IUserService;
import com.app.dca.service.IUserServiceImpl;
@Validated
@RestController
@RequestMapping("/api")
public class UserRestController {
	@Autowired
	private IUserServiceImpl service;


	public IUserService getService() {
		return service;
	}

	public void setService(IUserServiceImpl service) {
		this.service = service;
	}
}