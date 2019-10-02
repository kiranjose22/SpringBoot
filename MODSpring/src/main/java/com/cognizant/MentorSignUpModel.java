package com.cognizant;

import java.util.List;

public class MentorSignUpModel {
	private boolean blogs;
	private boolean demos;
	private String email;
	private int experience;
	private String linkedin;
	private String password;
	private String phone;
	private boolean ppts;
	private String role;
	private List<String> skills;
	private String status;
	private String timeslot;
	private String timezone;
	private String userName;
	private boolean videos;
	
	
	
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public MentorSignUpModel() {
//		super();
	}
	public boolean isBlogs() {
		return blogs;
	}
	public void setBlogs(boolean blogs) {
		this.blogs = blogs;
	}
	public boolean isDemos() {
		return demos;
	}
	public void setDemos(boolean demos) {
		this.demos = demos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getLinkedin() {
		return linkedin;
	}
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isPpts() {
		return ppts;
	}
	public void setPpts(boolean ppts) {
		this.ppts = ppts;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTimeslot() {
		return timeslot;
	}
	public void setTimeslot(String timeslot) {
		this.timeslot = timeslot;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isVideos() {
		return videos;
	}
	public void setVideos(boolean videos) {
		this.videos = videos;
	}
	
	
}
