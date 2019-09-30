package com.cognizant.entities;

import java.util.Set;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class TrainerDetails {

	@Id
	@GeneratedValue
	private int id;
	@OneToOne
	@JoinColumn(name = "trainerdetails_user")
	private Users user;
	private int experience;
	private String timeZone;
	private String timeSlot;
	private String materialType;
	private String linkedinUrl;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "trainerdetails_id")
	private Set<MentorSkills> mentorSkills;
	
	

	public TrainerDetails() {
//		super();
	}

	public TrainerDetails(Users user, int experience, String timeZone, String timeSlot, String materialType,
			String linkedinUrl, Set<MentorSkills> mentorSkills) {
		super();
		this.user = user;
		this.experience = experience;
		this.timeZone = timeZone;
		this.timeSlot = timeSlot;
		this.materialType = materialType;
		this.linkedinUrl = linkedinUrl;
		this.mentorSkills = mentorSkills;
	}

	public Set<MentorSkills> getMentorSkills() {
		return mentorSkills;
	}

	public void setMentorSkills(Set<MentorSkills> mentorSkills) {
		this.mentorSkills = mentorSkills;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

}
