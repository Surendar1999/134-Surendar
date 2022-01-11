package com.java.Employee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.Employee.entity.EmpEntity;
import com.java.Employee.service.EmpService;

@RestController
@RequestMapping("/")
public class EmpController {
	
	EmpService empserv;
	

	@GetMapping("employees")
    public ResponseEntity<EmpEntity> getAllEmployeeById(@PathVariable long id){
    	
    	EmpEntity emp= empserv.findAllEmployeeById(id);
    	
    	return ResponseEntity.ok(emp);
    }
	
	@GetMapping("employees/{empid}")
    public ResponseEntity<EmpEntity> getEmployeesEmpById(@PathVariable long empid){
    	
    	EmpEntity emp= empserv.findEmployeeByEmpId(empid);
    	
    	return ResponseEntity.ok(emp);
    }
	
	@GetMapping("employees/{id}")
    public ResponseEntity<EmpEntity> getEmployeesById(@PathVariable long id){
    	
    	EmpEntity emp= empserv.findEmployeeById(id);
    	
    	return ResponseEntity.ok(emp);
    }
	

}
