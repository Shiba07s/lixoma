package com.TTSS01.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TTSS01.Entity.Course_Asst_Co_ordinator;
import com.TTSS01.Entity.Resourse_Office_staff;
import com.TTSS01.Entity.Resourse_person;
import com.TTSS01.Repository.Resourse_personRepository;
import com.TTSS01.Repository.courseAsstCoordinatorRepository;
import com.TTSS01.Repository.office_staffRepository;


@Service
public class Resourse_serviceImpl implements Resourse_service {
	
	
	@Autowired
	private office_staffRepository resourseRepo;
	
	@Autowired
	private courseAsstCoordinatorRepository courseAsstCoordinatorRepo;
	
	@Autowired
	private Resourse_personRepository Resourse_personRepo;

	@Override
	public Resourse_Office_staff createofficeStaffForm(Resourse_Office_staff resourse_Office_staff) {
		return resourseRepo.save(resourse_Office_staff);		
	}

	@Override
	public Resourse_person createForm(Resourse_person resourse_person) {
		return Resourse_personRepo.save(resourse_person);
	}

	@Override
	public Course_Asst_Co_ordinator createForm(Course_Asst_Co_ordinator course_Asst_Co_ordinator) {
		return courseAsstCoordinatorRepo.save(course_Asst_Co_ordinator);
	}

}
