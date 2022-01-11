package com.java.Technology.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.java.Technology.entity.TechEntity;
import com.java.Technology.service.TechService;

@RestController
public class TechController {
	TechService techservice;


	@GetMapping("{id}")
    public ResponseEntity<TechEntity> getProjectById(@PathVariable long id){
    	
    	TechEntity tech= techservice.findTechnologyById(id);
    	
    	return ResponseEntity.ok(tech);
    }
}
