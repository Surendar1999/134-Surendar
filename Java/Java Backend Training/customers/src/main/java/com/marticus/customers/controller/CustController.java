package com.marticus.customers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.customers.entity.CustEntity;
import com.marticus.customers.service.CustService;

@RestController
@RequestMapping("/customers")
public class CustController {

	@Autowired
	CustService custservice;
	
	@PostMapping("/")
	public ResponseEntity<Void> saveCust(@RequestBody CustEntity custent){
		
		custservice.saveCust(custent);
		return ResponseEntity.status(HttpStatus.CREATED).header("creation status", "created").build();
		
		
	}
	   @GetMapping("/{id}")
	    public ResponseEntity<CustEntity> getCustomersById(@PathVariable long id){
	    	
	    	CustEntity cust= custservice.findCustomersById(id);
	    	
	    	return ResponseEntity.ok(cust);
	    }

	   @GetMapping("/")
	    public ResponseEntity<List<CustEntity> >getallCustomers(){
	    	
	    	List<CustEntity> cust= custservice.findAllCustomers();
	    	
	    	return ResponseEntity.ok(cust);
	    }
	    
	 @DeleteMapping("/{id}")
	 public ResponseEntity<String> deleteCustomersById(@PathVariable long id){
	    	
	    	String body="Record deleted Succussfully" ;
	    	
	    	Boolean Status=custservice.deleteCustomersById(id);
	    	if(!Status) {
	    		body="Could not delete the record";
	    	}
	    	   	
	    	
	    	return ResponseEntity.ok().body(body);
	    }
	 
	 @PutMapping("/")
	 public ResponseEntity<String> updateCustomersById(@RequestBody CustEntity custent){
			
		    custservice.updateCustomersById(custent);
		    
		    String body="Updated Successfully" ;
		    
		
	    	return ResponseEntity.ok().body(body);
		    
			

			
		}
}