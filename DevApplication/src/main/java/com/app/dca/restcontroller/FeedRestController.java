package com.app.dca.restcontroller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


import com.app.dca.entity.Feed;
import com.app.dca.service.IFeedService;
import com.app.dca.service.IFeedServiceImpl;
import com.app.dca.exception.*;

@RestController
public class FeedRestController {
     
	@Autowired
	private IFeedServiceImpl service;
	
	@PostMapping("/feed")
	public Feed addFeed(@RequestBody Feed f) {
		return service.addFeed(f);
	}
	
	@PutMapping("/update")
	public Feed updateFeed(@RequestBody Feed f) {
	return service.editFeed(f);
	}
	
	@GetMapping("/feedId/{id}")
	public Feed getFeed(@PathVariable int id) throws UnknownFeedException {
		return service.getFeed(id);
	}
	
	
	@GetMapping("/delete/{id}")
	public Feed removeFeed(@PathVariable int id) throws UnknownFeedException{
		return service.removeFeed(id);
	}
	
	@GetMapping("/DevelopersFeed/{id}")
	public List<Feed> getFeedsByDeveloper(@PathVariable int id) throws UnknownDeveloperException{
		return service.getFeedsByDeveloper(id);
	}
	
	@GetMapping("/topic/{topic}")
	public List<Feed> getFeedsByTopic(@PathVariable String topic){
		return service.getFeedsByTopic(topic);
	}
	
}