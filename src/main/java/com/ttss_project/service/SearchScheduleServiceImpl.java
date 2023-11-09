package com.ttss_project.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttss_project.entities.SearchSchedule;
import com.ttss_project.repositories.SearchScheduleRepository;
 

@Service
public class SearchScheduleServiceImpl implements SearchScheduleService {
	
	
	@Autowired
	 private SearchScheduleRepository searchScheduleRepo;

	@Override
	 public List<SearchSchedule> findByReferencrId(String ref_planner_id) {
		List<SearchSchedule> findByRefId = searchScheduleRepo.findByRefId(ref_planner_id);
		return findByRefId;
	}

	@Override
	public List<SearchSchedule> getAll() {
		// TODO Auto-generated method stub
		return searchScheduleRepo.findAll();
	}
	 

}
