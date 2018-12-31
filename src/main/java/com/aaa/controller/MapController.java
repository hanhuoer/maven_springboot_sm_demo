package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapController {
	
	@RequestMapping("/toHome")
	public String toHome(){
		return "home";
	}
	
	@RequestMapping("/toEmp")
	public String toEmp(){
		return "employee";
	}

}
