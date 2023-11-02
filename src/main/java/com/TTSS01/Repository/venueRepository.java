package com.TTSS01.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TTSS01.Entity.VenueDetails;

public interface venueRepository extends JpaRepository<VenueDetails, Long>{
	

	
}
