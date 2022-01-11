package com.java.Project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.Project.entity.ProEntity;
import com.java.Project.service.ProService;

@RestController
@RequestMapping("/")
public class ProController {
	ProService proservice;


	@GetMapping("{id}")
    public ResponseEntity<ProEntity> getProjectById(@PathVariable long id){
    	
    	ProEntity pro= proservice.findProjectById(id);
    	
    	return ResponseEntity.ok(pro);
    }

}
