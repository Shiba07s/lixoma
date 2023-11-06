package com.pdf.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pdf.entities.Planner;
import com.pdf.service.PlannerService;


@RestController
@RequestMapping("/api")
public class PlannerController {
	
	@Autowired
	private PlannerService plannerService;
	
	@PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            plannerService.uploadAndStoreFile(file);
            return ResponseEntity.ok("File uploaded and data saved successfully.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error uploading and saving data: " + e.getMessage());
        }
    }
	@GetMapping("/list")
    public ResponseEntity<List<Planner>> getAllPlanners() {
        List<Planner> planners = plannerService.getAllPlanners();
        return new ResponseEntity<>(planners, HttpStatus.OK);
    }
	
//	 @PostMapping("/upload")
//	    public ResponseEntity<String> uploadExcelFile(@RequestParam("file") MultipartFile file) {
//	        try {
//	            plannerService.uploadAndStoreExcel(file);
//	            return ResponseEntity.ok("File uploaded and data stored successfully.");
//	        } catch (IllegalArgumentException e) {
//	            return ResponseEntity.badRequest().body(e.getMessage());
//	        } catch (IOException e) {
//	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred during file processing.");
//	        }
//	    }


}
