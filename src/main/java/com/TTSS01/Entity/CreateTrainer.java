package com.TTSS01.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="trainer")
public class CreateTrainer {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    @NotNull
	    private long treasuryid;

	    @NotBlank
	    @Size(min = 3, max = 50)
	    private String trainerName;

	    @NotBlank
	    @Size(min = 3, max = 50)
	    private String trainerAgencyName;

	    @NotNull
	    private long mobileNumber;

	    @Email
	    private String email;

	    @NotNull
	    private long bankAccountNumber;

	    @Pattern(regexp = "^[A-Z]{4}[0-9]{7}$")
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

		public String getTrainerName() {
			return trainerName;
		}

		public void setTrainerName(String trainerName) {
			this.trainerName = trainerName;
		}

		public String getTrainerAgencyName() {
			return trainerAgencyName;
		}

		public void setTrainerAgencyName(String trainerAgencyName) {
			this.trainerAgencyName = trainerAgencyName;
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
