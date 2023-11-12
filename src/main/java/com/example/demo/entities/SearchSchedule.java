package com.example.demo.entities;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="academiccalenderupdate2")
public class SearchSchedule {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long sl_No;

	    private String ref_planner_id;
	    private String venue_id;
	    private String tmonth;
	    private String tyear;
	    private String training_reg_start_dt;
	    private String training_reg_end_dt;
	    private String tagency;
	    private String tname;
	    private String TSubjects;
	    private String tcategory;
	    private String tspell;
	    private String tdescription;
	    private String preferd_location;
	    private String tgrade;
	    private String t_target_group;
	    private String number_of_stakeholder;
	    private String number_day_needed;
	    private String thours_per_day;
	    private String total_hours;
	    private String tmode;
	    private String tstatus;
		public Long getSl_No() {
			return sl_No;
		}
		public void setSl_No(Long sl_No) {
			this.sl_No = sl_No;
		}
		public String getRef_planner_id() {
			return ref_planner_id;
		}
		public void setRef_planner_id(String ref_planner_id) {
			this.ref_planner_id = ref_planner_id;
		}
		public String getVenue_id() {
			return venue_id;
		}
		public void setVenue_id(String venue_id) {
			this.venue_id = venue_id;
		}
		public String getTmonth() {
			return tmonth;
		}
		public void setTmonth(String tmonth) {
			this.tmonth = tmonth;
		}
		public String getTyear() {
			return tyear;
		}
		public void setTyear(String tyear) {
			this.tyear = tyear;
		}
		public String getTraining_reg_start_dt() {
			return training_reg_start_dt;
		}
		public void setTraining_reg_start_dt(String training_reg_start_dt) {
			this.training_reg_start_dt = training_reg_start_dt;
		}
		public String getTraining_reg_end_dt() {
			return training_reg_end_dt;
		}
		public void setTraining_reg_end_dt(String training_reg_end_dt) {
			this.training_reg_end_dt = training_reg_end_dt;
		}
		public String getTagency() {
			return tagency;
		}
		public void setTagency(String tagency) {
			this.tagency = tagency;
		}
		public String getTname() {
			return tname;
		}
		public void setTname(String tname) {
			this.tname = tname;
		}
		public String getTSubjects() {
			return TSubjects;
		}
		public void setTSubjects(String tSubjects) {
			TSubjects = tSubjects;
		}
		public String getTcategory() {
			return tcategory;
		}
		public void setTcategory(String tcategory) {
			this.tcategory = tcategory;
		}
		public String getTspell() {
			return tspell;
		}
		public void setTspell(String tspell) {
			this.tspell = tspell;
		}
		public String getTdescription() {
			return tdescription;
		}
		public void setTdescription(String tdescription) {
			this.tdescription = tdescription;
		}
		public String getPreferd_location() {
			return preferd_location;
		}
		public void setPreferd_location(String preferd_location) {
			this.preferd_location = preferd_location;
		}
		public String getTgrade() {
			return tgrade;
		}
		public void setTgrade(String tgrade) {
			this.tgrade = tgrade;
		}
		public String getT_target_group() {
			return t_target_group;
		}
		public void setT_target_group(String t_target_group) {
			this.t_target_group = t_target_group;
		}
		public String getNumber_of_stakeholder() {
			return number_of_stakeholder;
		}
		public void setNumber_of_stakeholder(String number_of_stakeholder) {
			this.number_of_stakeholder = number_of_stakeholder;
		}
		public String getNumber_day_needed() {
			return number_day_needed;
		}
		public void setNumber_day_needed(String number_day_needed) {
			this.number_day_needed = number_day_needed;
		}
		public String getThours_per_day() {
			return thours_per_day;
		}
		public void setThours_per_day(String thours_per_day) {
			this.thours_per_day = thours_per_day;
		}
		public String getTotal_hours() {
			return total_hours;
		}
		public void setTotal_hours(String total_hours) {
			this.total_hours = total_hours;
		}
		public String getTmode() {
			return tmode;
		}
		public void setTmode(String tmode) {
			this.tmode = tmode;
		}
		public String getTstatus() {
			return tstatus;
		}
		public void setTstatus(String tstatus) {
			this.tstatus = tstatus;
		}
	    
	    
}