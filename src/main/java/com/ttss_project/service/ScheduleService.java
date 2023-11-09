package com.ttss_project.service;

import org.springframework.util.MultiValueMap;

import com.ttss_project.entities.Schedule;

public interface ScheduleService {
	Schedule saveSchedule(MultiValueMap<String, String> formData) ;

}
