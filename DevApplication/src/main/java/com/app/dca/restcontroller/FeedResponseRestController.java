package com.app.dca.restcontroller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dca.dto.FeedResponseDTO;
import com.app.dca.entity.FeedResponse;
import com.app.dca.exception.UnknownDeveloperException;
import com.app.dca.exception.UnknownFeedException;
import com.app.dca.exception.UnknownFeedResponseException;
import com.app.dca.service.IFeedResponseService;
import com.app.dca.service.IFeedResponseServiceImpl;

@Validated
@RestController
@RequestMapping("/api")
public class FeedResponseRestController {
	
	@Autowired
    IFeedResponseServiceImpl service;
	
	public FeedResponseRestController() {
		System.out.println("--------Response Rest Controller Constructor----------");
	}
	
	
	@PostMapping("/response")
	public FeedResponse addResponse(@RequestBody  FeedResponse resp)
	{
		FeedResponse f = service.addResponse(resp);
		FeedResponseDTO dto = new FeedResponseDTO(f.getRespId(), f.getAnswer(),f.getRespDate(),f.getRespTime(),f.getAccuracy());
		return resp;
	}
	
	@PutMapping("/updateResponse")
	public FeedResponse updateFeedResponse(@RequestBody FeedResponse resp) {
		return service.editResponse(resp);
	}
	
	@DeleteMapping("/deleteResponse/{id}")
	public FeedResponse removeFeedResponse(@PathVariable int id) throws UnknownFeedResponseException {
		return service.removeResponse(id);
	}
	
	@GetMapping("/getByFeedId")
	public List<FeedResponse> getResponsesByFeed(@PathVariable int feedId) throws UnknownFeedException {
		return service.getResponseByFeed(feedId);
	}
	
	
	@GetMapping("/FeedResponses")
	public List<FeedResponse> getAllFeedResponses(){
		return service.getAllResponses();
	}
	
}//end class
