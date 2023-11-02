package com.TTSS01.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TTSS01.Entity.VenueDetails;
import com.TTSS01.Repository.venueRepository;


@Service
public class VenueServiceImpl implements VenueService {
	
	
	@Autowired
	private venueRepository venueRepository;

	@Override
	public VenueDetails createVenue(VenueDetails venuedetails) {
		return venueRepository.save(venuedetails);		
		 
	}

	@Override
	public List<VenueDetails> getAllVenues() {
		return venueRepository.findAll();		
	}
	
	

	
		
		
		
		
	}


