package com.TTSS01.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TTSS01.Entity.Organisation_Agency;
import com.TTSS01.Repository.*;

@Service
public class OrganisationServiceImpl implements OrganisationService {
	
	@Autowired
	OrganisationRepository OrganisationRepository;

	@Override
	public Organisation_Agency createOrganisation(Organisation_Agency Organisation_Agency) {
		return OrganisationRepository.save(Organisation_Agency)	 ;
	}
	
	

}
