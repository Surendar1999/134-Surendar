package com.marticus.technology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.technology.entity.TechnologyEntity;
import com.marticus.technology.service.TechnologyService;

@RestController
@RequestMapping("/technology")
public class TechnologyController {
	
	@Autowired
	TechnologyService technologyService;
	
	
	@PostMapping("/")
	public ResponseEntity<Void> saveTechnology(@RequestBody TechnologyEntity technologyEntity) 
	{
		technologyService.saveTechnology(technologyEntity);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<TechnologyEntity>getCustomer(@PathVariable("id") int id)
	{
		TechnologyEntity technologyEntity= technologyService.findTechnologyById(id);
		return ResponseEntity.ok(technologyEntity);
	}
}