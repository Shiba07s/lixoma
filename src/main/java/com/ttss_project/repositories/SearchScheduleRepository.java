package com.ttss_project.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ttss_project.entities.SearchSchedule;



public interface SearchScheduleRepository extends JpaRepository<SearchSchedule, Integer> {
	
	@Query("SELECT ss FROM SearchSchedule ss WHERE ss.ref_planner_id = :ref_planner_id")
	List<SearchSchedule> findByRefId(@Param("ref_planner_id") String ref_planner_id);

}
