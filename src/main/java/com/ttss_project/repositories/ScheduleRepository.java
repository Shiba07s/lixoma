package com.ttss_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.MultiValueMap;

import com.ttss_project.entities.Schedule;
import com.ttss_project.entities.SearchSchedule;

public interface ScheduleRepository extends JpaRepository<Schedule, String> {

	Schedule save(MultiValueMap<String, String> formData);

	//SearchSchedule save(schedule schedule);

}
