package com.ttss01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttss01.entities.Signup;

public interface SignupRepository extends JpaRepository<Signup,Long> {

	//Signup save(Signup signup);

}
