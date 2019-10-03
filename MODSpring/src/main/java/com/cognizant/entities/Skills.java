package com.cognizant.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Skills {

	@Id
	private String skill;

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
	
}
