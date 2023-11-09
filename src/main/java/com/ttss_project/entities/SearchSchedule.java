package com.ttss_project.entities;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trainingschedule")
public class SearchSchedule {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sl_no;
	private String ref_planner_id;
	private String tactual_id;
	private String tmonth;
	private String tyear;
	private String tcode;
	private String tname;
	private String tmode;
	private String tmodule;
	private String tgrade;
	private String tagency;
	private String tdescription;
	private String act_duration;
	private String actual_start_dt;
	private String actual_end_dt;
	private String venue_id;
	private String training_reg_start_dt;
	private String training_reg_end_dt;
	private String withdrawal_start_dt;
	private String withdrawal_end_dt;
	private String tadmin;
	private String created_by;
	private String created_dt;
	private String modified_by;
	private String modified_dt;
	private String record_status;
	public int getSl_no() {
		return sl_no;
	}
	public void setSl_no(int sl_no) {
		this.sl_no = sl_no;
	}
	public String getRef_planner_id() {
		return ref_planner_id;
	}
	public void setRef_planner_id(String ref_planner_id) {
		this.ref_planner_id = ref_planner_id;
	}
	public String getTactual_id() {
		return tactual_id;
	}
	public void setTactual_id(String tactual_id) {
		this.tactual_id = tactual_id;
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
	public String getTcode() {
		return tcode;
	}
	public void setTcode(String tcode) {
		this.tcode = tcode;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTdescription() {
		return tdescription;
	}
	public void setTdescription(String tdescription) {
		this.tdescription = tdescription;
	}
	public String getAct_duration() {
		return act_duration;
	}
	public void setAct_duration(String act_duration) {
		this.act_duration = act_duration;
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
	public String getVenue_id() {
		return venue_id;
	}
	public void setVenue_id(String venue_id) {
		this.venue_id = venue_id;
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
	public String getWithdrawl_start_dt() {
		return withdrawal_start_dt;
	}
	public void setWithdrawl_start_dt(String withdrawl_start_dt) {
		this.withdrawal_start_dt = withdrawl_start_dt;
	}
	public String getWithdrawl_end_dt() {
		return withdrawal_end_dt;
	}
	public void setWithdrawl_end_dt(String withdrawl_end_dt) {
		this.withdrawal_end_dt = withdrawl_end_dt;
	}
	public String getTadmin() {
		return tadmin;
	}
	public void setTadmin(String tadmin) {
		this.tadmin = tadmin;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_dt() {
		return created_dt;
	}
	public void setCreated_dt(String created_dt) {
		this.created_dt = created_dt;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public String getModified_dt() {
		return modified_dt;
	}
	public void setModified_dt(String modified_dt) {
		this.modified_dt = modified_dt;
	}
	public String getRecord_status() {
		return record_status;
	}
	public void setRecord_status(String record_status) {
		this.record_status = record_status;
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
	public String getWithdrawal_start_dt() {
		return withdrawal_start_dt;
	}
	public void setWithdrawal_start_dt(String withdrawal_start_dt) {
		this.withdrawal_start_dt = withdrawal_start_dt;
	}
	public String getWithdrawal_end_dt() {
		return withdrawal_end_dt;
	}
	public void setWithdrawal_end_dt(String withdrawal_end_dt) {
		this.withdrawal_end_dt = withdrawal_end_dt;
	}
	
	
	
}
