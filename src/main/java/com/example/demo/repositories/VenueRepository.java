package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.SearchSchedule;
import com.example.demo.entities.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {
	
	@Query("SELECT ss FROM Venue ss WHERE ss.venue_id = :venue_id")
	List<Venue> findByRefId(@Param("venue_id") String venue_id);
	
	@Query("SELECT ss FROM Venue ss WHERE ss.venue_name = :venue_name")
	List<Venue> findByVenueName(@Param("venue_name") String venue_name);
	
	 @Query("SELECT v.venue_name,v.venue_id FROM Venue v")
	 List<Object[]> findAllVenueNames();

}
