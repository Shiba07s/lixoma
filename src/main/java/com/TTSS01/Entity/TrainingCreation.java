package com.TTSS01.Entity;




import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="created_trainings")
public class TrainingCreation {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String month;
	private String tentativeDates;
	private String nameoforganisation;
	private String nameoftheprogram;
	private String nubjectorkeyAreaofintervantionandTrainingTopics;
	private String categoryofTrainings;
	private String spell;
	private String placeofInterventioninAPDistricts;
	private String grades;
	private String targetGroupTeachersEducationalLeadersetc;
	private String totalnumberofstakeholdersintargetgroupinthestate;
	private String numberofdaysNeeded;
	private String numberofhoursneededperday;
	private String totalNumberofHours;
	private String modeandElementsOnlineInpersonOnlyBlendedPLC;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getTentativeDates() {
		return tentativeDates;
	}
	public void setTentativeDates(String tentativeDates) {
		this.tentativeDates = tentativeDates;
	}
	public String getNameoforganisation() {
		return nameoforganisation;
	}
	public void setNameoforganisation(String nameoforganisation) {
		this.nameoforganisation = nameoforganisation;
	}
	public String getNameoftheprogram() {
		return nameoftheprogram;
	}
	public void setNameoftheprogram(String nameoftheprogram) {
		this.nameoftheprogram = nameoftheprogram;
	}
	public String getNubjectorkeyAreaofintervantionandTrainingTopics() {
		return nubjectorkeyAreaofintervantionandTrainingTopics;
	}
	public void setNubjectorkeyAreaofintervantionandTrainingTopics(String nubjectorkeyAreaofintervantionandTrainingTopics) {
		this.nubjectorkeyAreaofintervantionandTrainingTopics = nubjectorkeyAreaofintervantionandTrainingTopics;
	}
	public String getCategoryofTrainings() {
		return categoryofTrainings;
	}
	public void setCategoryofTrainings(String categoryofTrainings) {
		this.categoryofTrainings = categoryofTrainings;
	}
	public String getSpell() {
		return spell;
	}
	public void setSpell(String spell) {
		this.spell = spell;
	}
	public String getPlaceofInterventioninAPDistricts() {
		return placeofInterventioninAPDistricts;
	}
	public void setPlaceofInterventioninAPDistricts(String placeofInterventioninAPDistricts) {
		this.placeofInterventioninAPDistricts = placeofInterventioninAPDistricts;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	public String getTargetGroupTeachersEducationalLeadersetc() {
		return targetGroupTeachersEducationalLeadersetc;
	}
	public void setTargetGroupTeachersEducationalLeadersetc(String targetGroupTeachersEducationalLeadersetc) {
		this.targetGroupTeachersEducationalLeadersetc = targetGroupTeachersEducationalLeadersetc;
	}
	public String getTotalnumberofstakeholdersintargetgroupinthestate() {
		return totalnumberofstakeholdersintargetgroupinthestate;
	}
	public void setTotalnumberofstakeholdersintargetgroupinthestate(
			String totalnumberofstakeholdersintargetgroupinthestate) {
		this.totalnumberofstakeholdersintargetgroupinthestate = totalnumberofstakeholdersintargetgroupinthestate;
	}
	public String getNumberofdaysNeeded() {
		return numberofdaysNeeded;
	}
	public void setNumberofdaysNeeded(String numberofdaysNeeded) {
		this.numberofdaysNeeded = numberofdaysNeeded;
	}
	public String getNumberofhoursneededperday() {
		return numberofhoursneededperday;
	}
	public void setNumberofhoursneededperday(String numberofhoursneededperday) {
		this.numberofhoursneededperday = numberofhoursneededperday;
	}
	public String getTotalNumberofHours() {
		return totalNumberofHours;
	}
	public void setTotalNumberofHours(String totalNumberofHours) {
		this.totalNumberofHours = totalNumberofHours;
	}
	public String getModeandElementsOnlineInpersonOnlyBlendedPLC() {
		return modeandElementsOnlineInpersonOnlyBlendedPLC;
	}
	public void setModeandElementsOnlineInpersonOnlyBlendedPLC(String modeandElementsOnlineInpersonOnlyBlendedPLC) {
		this.modeandElementsOnlineInpersonOnlyBlendedPLC = modeandElementsOnlineInpersonOnlyBlendedPLC;
	}
	
	@OneToMany(targetEntity = VenueDetails.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    private List<VenueDetails> venues;
	
	
	
}
