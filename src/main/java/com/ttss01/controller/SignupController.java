package com.ttss01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttss01.entities.Signup;
import com.ttss01.services.SignupService;

@RestController
@RequestMapping("/api/")
public class SignupController {
	
	@Autowired
	private SignupService signupService;
	
	 @PostMapping("/signup/create")
	    public Signup createSignup(@RequestBody Signup signup) {
	        return signupService.createSignup(signup);
	    }
	 @GetMapping("/signup/getAll")
	    public List<Signup> getAllSignups() {
	        return signupService.getAllSignups();
	    }
	

}
