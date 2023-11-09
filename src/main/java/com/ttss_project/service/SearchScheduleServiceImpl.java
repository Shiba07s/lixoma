package com.ttss_project.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttss_project.entities.SearchSchedule;
import com.ttss_project.repositories.SearchScheduleRepository;
 

@Service
public class SearchScheduleServiceImpl implements SearchScheduleService {
	
	
	@Autowired
	SearchScheduleRepository SearchScheduleRepo;

	@Override
	 public List<SearchSchedule> findByReferencrId(String ref_planner_id) {
		List<SearchSchedule> findByRefId = SearchScheduleRepo.findByRefId(ref_planner_id);
		return findByRefId;
	}
	 

}
