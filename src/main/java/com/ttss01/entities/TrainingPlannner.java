package com.ttss01.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;

@Builder
@Entity
@Table(name= "training_planner")
public class TrainingPlannner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="academic_year",nullable=false)
	private long academicYear;
	
	@Column(name="academic_month",nullable=false)
	private String academicMonth;
	
	@Column(name="training_name",nullable=false)
	private String trainingName;
	
	@Column(name="start_date",nullable=false)
	private Date startDate;
	
	@Column(name="end_date",nullable=false)
	private Date endDate;
	
	@Column(name="duration",nullable=false)
	private long duration;
	
	@Column(name="participants_type",nullable=false)
	private String participantsType;
	
	@Column(name="description",nullable=false)
	private String description;
	
	@Column(name="training_mode",nullable=false)
	private String trainingMode;
	
	@Column(name="location",nullable=false)
	private String location;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(long academicYear) {
		this.academicYear = academicYear;
	}
	public String getAcademicMonth() {
		return academicMonth;
	}
	public void setAcademicMonth(String academicMonth) {
		this.academicMonth = academicMonth;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public String getParticipantsType() {
		return participantsType;
	}
	public void setParticipantsType(String participantsType) {
		this.participantsType = participantsType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTrainingMode() {
		return trainingMode;
	}
	public void setTrainingMode(String trainingMode) {
		this.trainingMode = trainingMode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
