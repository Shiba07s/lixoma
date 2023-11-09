package com.ttss_project.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ttss_project.entities.Schedule;
import com.ttss_project.entities.SearchSchedule;
import com.ttss_project.service.ScheduleService;
import com.ttss_project.service.SearchScheduleService;

 
@RestController
@RequestMapping("/api")
public class SearchScheduleController {
	@Autowired
	private SearchScheduleService searchScheduleService;
	@Autowired
	private ScheduleService scheduleService;
	
	
	@GetMapping("/schedule")
	public ResponseEntity<List<SearchSchedule>>getTrainingByRefId(@RequestParam String ref_planner_id){
		
		List<SearchSchedule> result = searchScheduleService.findByReferencrId(ref_planner_id);
		
		return ResponseEntity.ok(result);
	}
	@PostMapping(value = "/save", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
	public ResponseEntity<String> saveSchedule(@RequestParam MultiValueMap<String, String> formData) {
	        try {
	        	scheduleService.saveSchedule(formData);
	            return ResponseEntity.ok("Schedule saved successfully");
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving schedule");
	        }
	 }
	
	@GetMapping("/list")
	public ResponseEntity<List<SearchSchedule>> getAllData(){
		List<SearchSchedule> list = searchScheduleService.getAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	    
//	 @PostMapping(value="/save", produces = {"application/json", "application/json"}
//     ,  consumes = {"application/x-www-form-urlencoded"})
//	 public ResponseEntity<String> saveSchedule1(@RequestBody Schedule schedule) {
//		 try {
//			 scheduleService.saveSchedule(schedule);
//			 return ResponseEntity.ok("Schedule saved successfully");
//		 } catch (Exception e) {
//			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving schedule");
//		 }
//	 }

	 
//	 @PostMapping("/save")
//	    public ResponseEntity<Schedule> saveSchedule(@RequestBody MultiValueMap<String, String> formData) {
//	        // Extract form parameters
//	        String trainingReferenceId = formData.getFirst("trainingReferenceId");
//	        String trainingMode = formData.getFirst("trainingMode");
//	        String trainingMonth = formData.getFirst("trainingMonth");
//	        String trainingYear = formData.getFirst("trainingYear");
//	        // Extract other parameters similarly
//
//	        // Your logic to process the form data
//	        // For example, you can create a SearchSchedule object and save it to the database
//	       // SearchSchedule searchSchedule = new SearchSchedule();
//	        Schedule searchSchedule = new Schedule();
//	        searchSchedule.setTrainingMo
//	        searchSchedule.setTrainingMode(trainingMode);
//	        searchSchedule.setTrainingMonth(trainingMonth);
//	        searchSchedule.setTrainingYear(trainingYear);
//	        // Set other parameters similarly
//
//	        // Save the searchSchedule to the database using your service
//	        scheduleService.saveSchedule(searchSchedule);
//
//	        return ResponseEntity.ok("Schedule saved successfully");
//	    }
}
