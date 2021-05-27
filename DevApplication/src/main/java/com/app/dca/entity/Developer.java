package com.app.dca.entity;

import java.time.LocalDate;  // import statement
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Developer{//class
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty(message = "Id cannot be left empty")
	private int devId;
	
	@NotEmpty(message = "Name cannot be let blank or null")//not empty 
	private String name;
	
	
	@NotEmpty(message = "Email is mandatory")
	private String email;
	
	@NotEmpty(message = "Skill level is mandatory and it should be Beginner, Intermediate or Expert")
	private String skillLevel;	// Beginner/Intermediate/Expert
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotBlank(message = "Please provide a date.")
	private LocalDate memberSince;
	
	
	@OneToMany(mappedBy = "dev")
	private List<Feed> feeds;
	
   @OneToOne
   @JoinColumn(name = "userId", referencedColumnName = "userId")
   private UserD user;
	
	private int totalFeeds;	
	
	private int reputation;		// Likes on Feed/Response by developer increase reputation
	
	private boolean isVerified;
	
	private boolean isBlocked;	// Can be blocked by admin on the ground of unethical feed/response
	
	public Developer(int devId, String name, String email, String skillLevel, LocalDate memberSince, List<Feed> feeds,
			UserD user, int totalFeeds, int reputation, boolean isVerified, boolean isBlocked) {
	    super();
		this.devId = devId;
		this.name = name;
		this.email = email;
		this.skillLevel = skillLevel;
		this.memberSince = memberSince;
		this.feeds = feeds;
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
	public List<Feed> getFeeds() {
		return feeds;
	}
	public void setFeeds(List<Feed> feeds) {
		this.feeds = feeds;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + devId;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((feeds == null) ? 0 : feeds.hashCode());
		result = prime * result + (isBlocked ? 1231 : 1237);
		result = prime * result + (isVerified ? 1231 : 1237);
		result = prime * result + ((memberSince == null) ? 0 : memberSince.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + reputation;
		result = prime * result + ((skillLevel == null) ? 0 : skillLevel.hashCode());
		result = prime * result + totalFeeds;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		if (devId != other.devId)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (feeds == null) {
			if (other.feeds != null)
				return false;
		} else if (!feeds.equals(other.feeds))
			return false;
		if (isBlocked != other.isBlocked)
			return false;
		if (isVerified != other.isVerified)
			return false;
		if (memberSince == null) {
			if (other.memberSince != null)
				return false;
		} else if (!memberSince.equals(other.memberSince))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (reputation != other.reputation)
			return false;
		if (skillLevel == null) {
			if (other.skillLevel != null)
				return false;
		} else if (!skillLevel.equals(other.skillLevel))
			return false;
		if (totalFeeds != other.totalFeeds)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Developer [devId=" + devId + ", name=" + name + ", email=" + email + ", skillLevel=" + skillLevel
				+ ", memberSince=" + memberSince + ", feeds=" + feeds + ", user=" + user + ", totalFeeds=" + totalFeeds
				+ ", reputation=" + reputation + ", isVerified=" + isVerified + ", isBlocked=" + isBlocked + "]";
	}
	
}
