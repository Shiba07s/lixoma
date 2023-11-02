package com.TTSS01.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="training_planner")
public class Trainingplanner {
	
	
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
	private String duration;

	@Column(name="participants_type",nullable=false)
	private String participantsType;

	@Column(name="description",nullable=false)
	private String description;

	@Column(name="training_mode",nullable=false)
	private String trainingMode;

	@Column(name="location",nullable=false)
	private String location;
	
	private boolean archived;

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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
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

	public boolean isArchived() {
		return archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}

	

		
	

}
