package com.ttss_project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.ttss_project.entities.Schedule;
import com.ttss_project.repositories.ScheduleRepository;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	
	@Autowired
	private ScheduleRepository scheduleRepo;

	@Override
	public Schedule saveSchedule(MultiValueMap<String, String> formData) {
		// TODO Auto-generated method stub
		return scheduleRepo.save(formData);
	}

//	@Override
//	public Schedule saveSchedule(Schedule schedule) {
//		return scheduleRepo.save(schedule);
//	}
	
	

}
