package com.cognizant.entities;

import java.util.Set;

import javax.persistence.CascadeType;
//import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class Users {
	@Id
	private String userMail;
	private String userName;
	private String password;
	private String status;
	private String role;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "users_trainings", joinColumns = {
			@JoinColumn(referencedColumnName = "userMail") }, inverseJoinColumns = {
					@JoinColumn(referencedColumnName = "id") })
	private Set<Trainings> trainings;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="users_userMail")
	private Set<Payments> payments;
	
	@OneToOne(mappedBy="user")
	private TrainerDetails trainerDetails;
	
	

	public Users() {
		
	}

	public Users(String userMail, String userName, String password, String status, String role,
			Set<Trainings> trainings, Set<Payments> payments) {
		super();
		this.userMail = userMail;
		this.userName = userName;
		this.password = password;
		this.status = status;
		this.role = role;
		this.trainings = trainings;
		this.payments = payments;
	}

	public Set<Payments> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payments> payments) {
		this.payments = payments;
	}

	public Set<Trainings> getTrainings() {
		return trainings;
	}

	public void setTrainings(Set<Trainings> trainings) {
		this.trainings = trainings;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

//	@Embedded
////	private Address address;

//	
//	public Address getAddress() {
//		return address;
//	}
//
//
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	// ,Address address
//	

}
