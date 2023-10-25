package com.ttss01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttss01.entities.CreateTrainee;
import com.ttss01.services.CreateTraineeService;

@RestController
@RequestMapping("/api/trainee")
public class CreateTraineeController {
	
	@Autowired
	private CreateTraineeService createTraineeService;
	
	@PostMapping("/create")
	public ResponseEntity<CreateTrainee> createTraineeForm(@RequestBody CreateTrainee createTrainee) {
		CreateTrainee createTraineeForm = createTraineeService.createTraineeForm(createTrainee);
		return new ResponseEntity<CreateTrainee>(createTraineeForm,HttpStatus.OK);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<CreateTrainee>> getAllTraineeList(){
		List<CreateTrainee> allTrainees = createTraineeService.getAllTrainees();
		return new ResponseEntity<List<CreateTrainee>>(allTrainees, HttpStatus.OK);
		
	}
	
	

}
