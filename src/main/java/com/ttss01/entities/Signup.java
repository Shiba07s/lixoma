package com.ttss01.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="signup_user")
public class Signup {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String stateName;
	    private String districtName;
	    private String blockName;
	    private Long treasuryId;
	    private String employeeName;
	    private String schoolName;
	    private String designation;
	    private String mobileNumber;
	    private Date dateOfBirth;
	    private String accountNumber;
	    private String ifscCode;
	    
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		public String getDistrictName() {
			return districtName;
		}
		public void setDistrictName(String districtName) {
			this.districtName = districtName;
		}
		public String getBlockName() {
			return blockName;
		}
		public void setBlockName(String blockName) {
			this.blockName = blockName;
		}
		public Long getTreasuryId() {
			return treasuryId;
		}
		public void setTreasuryId(Long treasuryId) {
			this.treasuryId = treasuryId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getSchoolName() {
			return schoolName;
		}
		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getIfscCode() {
			return ifscCode;
		}
		public void setIfscCode(String ifscCode) {
			this.ifscCode = ifscCode;
		}
	    
	    
	    



}
