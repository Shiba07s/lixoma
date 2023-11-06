package com.pdf.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Planner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String TMonth;
    private String TDates;
    private String TOrganisers;
    private String TNames;
    private String TSubjects;
    private String TCategory;
    private String TSpell;
    private String PreferredLocation;
    private String AttndGrades;
    private String TargetGroup;
    private int NoOfStakeholders;  
    private String TDuration;
    private String THourPerDay;  
    private String TotalHours;  
    private String Mode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTMonth() {
		return TMonth;
	}
	public void setTMonth(String tMonth) {
		TMonth = tMonth;
	}
 
 
	public String getTDates() {
		return TDates;
	}
	public void setTDates(String tDates) {
		TDates = tDates;
	}
	public String getTOrganisers() {
		return TOrganisers;
	}
	public void setTOrganisers(String tOrganisers) {
		TOrganisers = tOrganisers;
	}
	public String getTNames() {
		return TNames;
	}
	public void setTNames(String tNames) {
		TNames = tNames;
	}
	public String getTSubjects() {
		return TSubjects;
	}
	public void setTSubjects(String tSubjects) {
		TSubjects = tSubjects;
	}
	public String getTCategory() {
		return TCategory;
	}
	public void setTCategory(String tCategory) {
		TCategory = tCategory;
	}
	public String getTSpell() {
		return TSpell;
	}
	public void setTSpell(String tSpell) {
		TSpell = tSpell;
	}
	public String getPreferredLocation() {
		return PreferredLocation;
	}
	public void setPreferredLocation(String preferredLocation) {
		PreferredLocation = preferredLocation;
	}
	public String getAttndGrades() {
		return AttndGrades;
	}
	public void setAttndGrades(String attndGrades) {
		AttndGrades = attndGrades;
	}
	public String getTargetGroup() {
		return TargetGroup;
	}
	public void setTargetGroup(String targetGroup) {
		TargetGroup = targetGroup;
	}
	public int getNoOfStakeholders() {
		return NoOfStakeholders;
	}
	public void setNoOfStakeholders(int noOfStakeholders) {
		NoOfStakeholders = noOfStakeholders;
	}
	public String getTDuration() {
		return TDuration;
	}
	public void setTDuration(String tDuration) {
		TDuration = tDuration;
	}
 
	public String getTHourPerDay() {
		return THourPerDay;
	}
	public void setTHourPerDay(String tHourPerDay) {
		THourPerDay = tHourPerDay;
	}
	public String getTotalHours() {
		return TotalHours;
	}
	public void setTotalHours(String totalHours) {
		TotalHours = totalHours;
	}
	public String getMode() {
		return Mode;
	}
	public void setMode(String mode) {
		Mode = mode;
	}
    
}
