package com.TTSS01.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TTSS01.Entity.Course_Asst_Co_ordinator;
import com.TTSS01.Entity.Resourse_Office_staff;
import com.TTSS01.Entity.Resourse_person;
import com.TTSS01.Services.Resourse_service;

@RestController
@RequestMapping("/api/Resourse")
public class ResourseController {
	
	@Autowired
	private Resourse_service resourse_service ;
	
	
	

    @PostMapping("/office-satff")
    public ResponseEntity<Resourse_Office_staff> createResourse(@RequestBody Resourse_Office_staff resourse_Office_staff) {
    	Resourse_Office_staff createofficeStaffForm = resourse_service.createofficeStaffForm(resourse_Office_staff);

        if (createofficeStaffForm != null) {
            return new ResponseEntity<>(createofficeStaffForm, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    	
    @PostMapping("/ResoursePerson")
    public ResponseEntity<Resourse_person> createResourse(@RequestBody Resourse_person resourse_person) {
    	Resourse_person createForm = resourse_service.createForm(resourse_person);

        if (createForm != null) {
            return new ResponseEntity<>(createForm, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/courseAsstCoordinator")
    public ResponseEntity<Course_Asst_Co_ordinator> createResourse(@RequestBody Course_Asst_Co_ordinator course_Asst_Co_ordinator) {
    	Course_Asst_Co_ordinator createForm = resourse_service.createForm(course_Asst_Co_ordinator);

        if (createForm != null) {
            return new ResponseEntity<>(createForm, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
