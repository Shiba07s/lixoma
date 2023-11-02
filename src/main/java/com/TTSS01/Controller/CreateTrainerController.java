package com.TTSS01.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TTSS01.Entity.CreateTrainer;
import com.TTSS01.Services.CreateTrainerService;

@RestController
@RequestMapping("/api/create")
public class CreateTrainerController {
	
	
	@Autowired
	CreateTrainerService createTrainerService;
	
	
	@PostMapping("/trainer")
    public ResponseEntity<CreateTrainer> createTrainer(@RequestBody CreateTrainer createTrainer) {
		CreateTrainer createOneTrainer = createTrainerService.CreateOneTrainer(createTrainer);
        if (createOneTrainer != null) {
            return new ResponseEntity<>(createOneTrainer, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
