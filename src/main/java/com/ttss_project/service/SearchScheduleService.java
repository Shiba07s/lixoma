package com.ttss_project.service;

import java.util.List;

import com.ttss_project.entities.SearchSchedule;


public interface SearchScheduleService {
	List<SearchSchedule> getAll();
	
	 
	
	 List<SearchSchedule> findByReferencrId(String ref_planner_id);

}
