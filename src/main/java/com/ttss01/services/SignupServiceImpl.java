package com.ttss01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttss01.entities.Signup;
import com.ttss01.repositories.SignupRepository;

@Service
public class SignupServiceImpl implements SignupService {
	
	@Autowired
	private SignupRepository signupRepo;

	 @Override
	    public Signup createSignup(Signup signup) {
	        return signupRepo.save(signup);
	    }

	 @Override
	    public List<Signup> getAllSignups() {
	        return signupRepo.findAll();
	    }

}
