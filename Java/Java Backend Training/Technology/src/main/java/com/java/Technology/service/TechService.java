package com.java.Technology.service;

import org.springframework.stereotype.Service;

import com.java.Technology.entity.TechEntity;
import com.java.Technology.repository.TechRepo;

@Service
public class TechService {

	TechRepo techrepo;
	public TechEntity findTechnologyById(long id) {
		
		return techrepo.getTechnologyById(id);
	}

}
