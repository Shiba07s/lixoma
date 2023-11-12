package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.SearchSchedule; 

public interface SearchScheduleService {
	 List<SearchSchedule> getAll(); 
	 List<SearchSchedule> findByReferencrId(String ref_planner_id);

}
