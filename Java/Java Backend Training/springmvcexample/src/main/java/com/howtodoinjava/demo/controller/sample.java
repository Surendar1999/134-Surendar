package com.howtodoinjava.demo.controller;
//http://localhost:8080/springmvcexample/testhello/testhello1

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/testhello")
public class sample {
	
	@RequestMapping(value = "/testhello1", method = RequestMethod.GET)
	public String getAllEmployees(Model model)
	{
		return"testhello";
	}
	
}
