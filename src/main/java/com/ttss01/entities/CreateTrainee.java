package com.ttss01.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "create_trainee")
public class CreateTrainee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="treasury_id",nullable=false)
	private int treasuryId;
	
	@Column(name="participants_name",nullable=false)
	private String partcipantsName;
	
	@Column(name="designation",nullable=false)
	private String designation;
	
	@Column(name="email_id",nullable=false)
	private String emailId;
	
	@Column(name="mobile_number",nullable=false)
	private long mobileNumber;
	
	@Column(name="bank_account_number",nullable=false)
	private long bankAccountNumber;
	
	@Column(name="ifsc_code",nullable=false)
	private String ifscCode;
	
	@Column(name="present_working_location",nullable=false)
	private String presentWorkingLocation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTreasuryId() {
		return treasuryId;
	}

	public void setTreasuryId(int treasuryId) {
		this.treasuryId = treasuryId;
	}

	public String getPartcipantsName() {
		return partcipantsName;
	}

	public void setPartcipantsName(String partcipantsName) {
		this.partcipantsName = partcipantsName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getPresentWorkingLocation() {
		return presentWorkingLocation;
	}

	public void setPresentWorkingLocation(String presentWorkingLocation) {
		this.presentWorkingLocation = presentWorkingLocation;
	}
	
	

}
