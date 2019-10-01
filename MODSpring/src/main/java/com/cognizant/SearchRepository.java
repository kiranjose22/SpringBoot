package com.cognizant;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.entities.SearchResult;
//import com.cognizant.entities.Users;

public interface SearchRepository extends CrudRepository<SearchResult, String> {

}
