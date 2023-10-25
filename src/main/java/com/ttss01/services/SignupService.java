package com.ttss01.services;

import java.util.List;

import com.ttss01.entities.Signup;

public interface SignupService {
	Signup createSignup(Signup signup);
    List<Signup> getAllSignups();

}
