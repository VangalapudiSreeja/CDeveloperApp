package com.app.dca.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import com.app.dca.entity.Feed;
import com.app.dca.entity.UserD;

public class DeveloperDTO {
	
    private int devId;	
	private String name;
	private String email;	
	private String skillLevel;	// Beginner/Intermediate/Expert
	private LocalDate memberSince;  
    private UserD user;	
	private int totalFeeds;	
	private int reputation;		// Likes on Feed/Response by developer increase reputation
	private boolean isVerified;
	private boolean isBlocked;	// Can be blocked by admin on the ground of unethical feed/response
	public DeveloperDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeveloperDTO(int devId, String name, String email, String skillLevel, LocalDate memberSince, UserD user,
			int totalFeeds, int reputation, boolean isVerified, boolean isBlocked) {
		super();
		this.devId = devId;
		this.name = name;
		this.email = email;
		this.skillLevel = skillLevel;
		this.memberSince = memberSince;
		this.user = user;
		this.totalFeeds = totalFeeds;
		this.reputation = reputation;
		this.isVerified = isVerified;
		this.isBlocked = isBlocked;
	}
	public int getDevId() {
		return devId;
	}
	public void setDevId(int devId) {
		this.devId = devId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkillLevel() {
		return skillLevel;
	}
	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}
	public LocalDate getMemberSince() {
		return memberSince;
	}
	public void setMemberSince(LocalDate memberSince) {
		this.memberSince = memberSince;
	}
	public UserD getUser() {
		return user;
	}
	public void setUser(UserD user) {
		this.user = user;
	}
	public int getTotalFeeds() {
		return totalFeeds;
	}
	public void setTotalFeeds(int totalFeeds) {
		this.totalFeeds = totalFeeds;
	}
	public int getReputation() {
		return reputation;
	}
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	public boolean isVerified() {
		return isVerified;
	}
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	public boolean isBlocked() {
		return isBlocked;
	}
	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	
	
	
	
	

}
