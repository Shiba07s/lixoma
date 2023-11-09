package com.ttss_project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tscheduledtrainings")
public class Schedule {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String ref_planner_id;
	
	@Column(nullable = false)
 	private String tmonth;
	@Column(nullable = false)
	private String tyear;
	@Column(nullable = false)
 	private String tname;
	@Column(nullable = false)
	private String tmode;
	@Column(nullable = false)
	private String tmodule;
	@Column(nullable = false)
	private String tgrade;
	@Column(nullable = false)
	private String tagency;
	@Column(nullable = false)
	private String tdescription;
	@Column(nullable = false)
 	private String actual_start_dt;
	@Column(nullable = false)
	private String actual_end_dt;
	@Column(nullable = false)
 	private String training_reg_start_dt;
	@Column(nullable = false)
	private String training_reg_end_dt;
	
	public String getRef_planner_id() {
		return ref_planner_id;
	}
	public void setRef_planner_id(String ref_planner_id) {
		this.ref_planner_id = ref_planner_id;
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
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTmode() {
		return tmode;
	}
	public void setTmode(String tmode) {
		this.tmode = tmode;
	}
	public String getTmodule() {
		return tmodule;
	}
	public void setTmodule(String tmodule) {
		this.tmodule = tmodule;
	}
	public String getTgrade() {
		return tgrade;
	}
	public void setTgrade(String tgrade) {
		this.tgrade = tgrade;
	}
	public String getTagency() {
		return tagency;
	}
	public void setTagency(String tagency) {
		this.tagency = tagency;
	}
	public String getTdescription() {
		return tdescription;
	}
	public void setTdescription(String tdescription) {
		this.tdescription = tdescription;
	}
	public String getActual_start_dt() {
		return actual_start_dt;
	}
	public void setActual_start_dt(String actual_start_dt) {
		this.actual_start_dt = actual_start_dt;
	}
	public String getActual_end_dt() {
		return actual_end_dt;
	}
	public void setActual_end_dt(String actual_end_dt) {
		this.actual_end_dt = actual_end_dt;
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
	
	

}
