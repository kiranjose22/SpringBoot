package com.cognizant;

import java.util.ArrayList;
//import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entities.SearchResult;
//import com.cognizant.entities.Users;

@Service
public class SearchService {

	@Autowired
	private SearchRepository sr;

	

	public ArrayList<SearchResult> getResultList() {
		
		ArrayList<SearchResult> resultList = new ArrayList<SearchResult>();
		sr.findAll().forEach(resultList::add);
		return resultList;
	}

	public SearchResult getResult(String id) {

		return sr.findById(id).orElse(null);
	}

//	public void setUserList(ArrayList<UserDetails> userList) {
//		this.userList = userList;
//	}
//
	public void addResultDetails(SearchResult s) {
		sr.save(s);
	}

//	
//	
	public void updateResult(SearchResult s, String id) {

		
		sr.save(s);
		
	}

//	
	public void deleteResult(String id) {
		sr.deleteById(id);
	}

}