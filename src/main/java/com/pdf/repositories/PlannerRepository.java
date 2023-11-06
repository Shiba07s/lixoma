package com.pdf.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdf.entities.Planner;



public interface PlannerRepository extends JpaRepository<Planner, Long>{

	//void saveAll(List<Planner> planners);

}

