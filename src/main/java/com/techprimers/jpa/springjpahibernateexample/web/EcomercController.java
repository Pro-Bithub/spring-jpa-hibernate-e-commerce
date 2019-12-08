package com.techprimers.jpa.springjpahibernateexample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("userscontact")
public class EcomercController {
	   @GetMapping(value = "/NewFile")
	public String index(){
		 return "NewFile";
	}
}
