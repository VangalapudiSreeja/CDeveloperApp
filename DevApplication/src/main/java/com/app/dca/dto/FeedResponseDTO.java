package com.app.dca.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class FeedResponseDTO {
	
	private int respId;
	private String answer;
	private LocalDate respDate;//if date & time coming in same way use @Temporal
	private LocalTime respTime;
	private int accuracy;
	public FeedResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedResponseDTO(int respId, String answer, LocalDate respDate, LocalTime respTime, int accuracy) {
		super();
		this.respId = respId;
		this.answer = answer;
		this.respDate = respDate;
		this.respTime = respTime;
		this.accuracy = accuracy;
	}
	public int getRespId() {
		return respId;
	}
	public void setRespId(int respId) {
		this.respId = respId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public LocalDate getRespDate() {
		return respDate;
	}
	public void setRespDate(LocalDate respDate) {
		this.respDate = respDate;
	}
	public LocalTime getRespTime() {
		return respTime;
	}
	public void setRespTime(LocalTime respTime) {
		this.respTime = respTime;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	

}
