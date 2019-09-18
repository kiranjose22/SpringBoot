package com.cognizant;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.entities.Trainings;
//import com.cognizant.entities.Users;

public interface TrainingsRepository extends CrudRepository<Trainings, String> {

}
