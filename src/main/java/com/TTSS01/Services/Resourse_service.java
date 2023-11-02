package com.TTSS01.Services;

import com.TTSS01.Entity.Course_Asst_Co_ordinator;
import com.TTSS01.Entity.Resourse_Office_staff;
import com.TTSS01.Entity.Resourse_person;

public interface Resourse_service {
	
	Resourse_Office_staff createofficeStaffForm(Resourse_Office_staff resourse_Office_staff);
	
    Resourse_person createForm(Resourse_person resourse_person);
    
    Course_Asst_Co_ordinator createForm(Course_Asst_Co_ordinator course_Asst_Co_ordinator);
}
