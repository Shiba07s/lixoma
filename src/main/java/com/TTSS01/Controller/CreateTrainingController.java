package com.TTSS01.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TTSS01.Entity.TrainingCreation;
import com.TTSS01.Entity.Trainingplanner;
import com.TTSS01.Services.TrainingCreationService;

@RestController
@RequestMapping("/api")
public class CreateTrainingController {
	
	@Autowired
	TrainingCreationService trainingCreationService;
	
	
	@PostMapping("/create/training")
    public ResponseEntity<TrainingCreation> createTraining(@RequestBody TrainingCreation trainingCreation) {
		TrainingCreation createTraining = trainingCreationService.createTraining(trainingCreation);

        if (createTraining != null) {
            return new ResponseEntity<>(createTraining, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	@GetMapping("/get/training")
	public ResponseEntity<List<TrainingCreation>>getAllTrainings(){
		List<TrainingCreation> allTrainings = trainingCreationService.getAllTrainings();
		return new ResponseEntity<List<TrainingCreation>>(allTrainings,HttpStatus.OK);
	
	}
	@GetMapping("/getinfo")
	public ResponseEntity<List<TrainingCreation>>getAllTrainingswithvenues(){
		 List<TrainingCreation> findAllTrainingsWithVenues = trainingCreationService.findAllTrainingsWithVenues();
		return new ResponseEntity<List<TrainingCreation>>(findAllTrainingsWithVenues,HttpStatus.OK);
}
}
