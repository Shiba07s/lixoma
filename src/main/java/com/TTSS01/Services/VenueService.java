package com.TTSS01.Services;

import java.util.List;

import com.TTSS01.Entity.VenueDetails;

public interface VenueService {
	
	VenueDetails createVenue(VenueDetails venuedetails);
	
	List<VenueDetails>getAllVenues();
	

}
