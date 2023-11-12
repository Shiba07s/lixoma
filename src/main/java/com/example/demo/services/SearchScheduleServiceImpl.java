package com.example.demo.services;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.SearchSchedule;
import com.example.demo.repositories.SearchScheduleRepository;
 

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
		return searchScheduleRepo.findAll();
	}
	 

}
