package com.ttss_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScheduleController {
	
	
	@RequestMapping("/homepage")
	public String shoeHomepage() {
		return "Homepage";
	}
	@RequestMapping("/schedule")
	public String createSchedule() {
		return "test3";
	}


@RequestMapping("/start")
public String createSchedule2() {
	return "test3";
}
	@RequestMapping("/viewSchedule")
	public String viewSchedule() {
		return "view_schedule";
	}
	 
	@RequestMapping("/traineeNotification")
	public String notification() {
		return "trainee_notification";
	}
	@RequestMapping("/applyTrainee")
	public String applyTrainee() {
		return "trainee_apply";
	}

}
