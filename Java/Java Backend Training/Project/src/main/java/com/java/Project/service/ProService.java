package com.java.Project.service;

import org.springframework.stereotype.Service;

import com.java.Project.entity.ProEntity;
import com.java.Project.repository.ProRepo;

@Service
public class ProService {
	ProRepo prorepo;

	public ProEntity findProjectById(long id) {

		 return prorepo.findProjectById(id);
	}

}
