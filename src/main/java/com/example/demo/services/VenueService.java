package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.SearchSchedule;
import com.example.demo.entities.Venue;

public interface VenueService {
	
	 List<Venue> getAll(); 
	 List<Venue> findByReferencrId(String venue_id);
     List<Venue> findByVenueName(String venue_name);
     List<Object[]> getAllVenueNames();

}
