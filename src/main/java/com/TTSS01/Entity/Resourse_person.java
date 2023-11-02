package com.TTSS01.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Resourse_person")
public class Resourse_person {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long treasuryid;
	private String presentWorkingLocation;
	private String employeeName;
	private String designation;
	private long mobileNumber;
	private String email;
	private long bankAccountNumber;
	private String ifscCode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getTreasuryid() {
		return treasuryid;
	}
	public void setTreasuryid(long treasuryid) {
		this.treasuryid = treasuryid;
	}
	public String getPresentWorkingLocation() {
		return presentWorkingLocation;
	}
	public void setPresentWorkingLocation(String presentWorkingLocation) {
		this.presentWorkingLocation = presentWorkingLocation;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
	

}
