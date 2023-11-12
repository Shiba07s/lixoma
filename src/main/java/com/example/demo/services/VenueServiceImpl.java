package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Venue;
import com.example.demo.repositories.VenueRepository;

@Service
public class VenueServiceImpl implements VenueService {
	
	@Autowired
	 private VenueRepository venueRepo;

	@Override
	 public List<Venue> findByReferencrId(String venue_id) {
		List<Venue> findByVenueId = venueRepo.findByRefId(venue_id);
		return findByVenueId;
	}
	@Override
	public List<Venue> findByVenueName(String venue_name){
		List<Venue> findByVenueName = venueRepo.findByVenueName(venue_name);
		return findByVenueName;
	}
	
	 public List<Object[]> getAllVenueNames() {
	        return venueRepo.findAllVenueNames();
	    }

	@Override
	public List<Venue> getAll() {
		return venueRepo.findAll();
	}

}
