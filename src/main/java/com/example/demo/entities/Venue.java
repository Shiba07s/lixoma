package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="venue")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slNo;

    private String venue_id;
    private String venue_name;
    private String module;
    private String v_state;
    private String v_district;
    private String v_mandal;
    private String coordinator_name;
    private String coordinator_email;
    private String coordinator_mobile;
	public Long getSlNo() {
		return slNo;
	}
	public void setSlNo(Long slNo) {
		this.slNo = slNo;
	}
	 
	public String getVenue_id() {
		return venue_id;
	}
	public void setVenue_id(String venue_id) {
		this.venue_id = venue_id;
	}
	public String getVenue_name() {
		return venue_name;
	}
	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getV_state() {
		return v_state;
	}
	public void setV_state(String v_state) {
		this.v_state = v_state;
	}
	public String getV_district() {
		return v_district;
	}
	public void setV_district(String v_district) {
		this.v_district = v_district;
	}
	public String getV_mandal() {
		return v_mandal;
	}
	public void setV_mandal(String v_mandal) {
		this.v_mandal = v_mandal;
	}
	public String getCoordinator_name() {
		return coordinator_name;
	}
	public void setCoordinator_name(String coordinator_name) {
		this.coordinator_name = coordinator_name;
	}
	public String getCoordinator_email() {
		return coordinator_email;
	}
	public void setCoordinator_email(String coordinator_email) {
		this.coordinator_email = coordinator_email;
	}
	public String getCoordinator_mobile() {
		return coordinator_mobile;
	}
	public void setCoordinator_mobile(String coordinator_mobile) {
		this.coordinator_mobile = coordinator_mobile;
	}


}

