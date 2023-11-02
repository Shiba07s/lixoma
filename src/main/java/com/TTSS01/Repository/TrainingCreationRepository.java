package com.TTSS01.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.TTSS01.Entity.TrainingCreation;

public interface TrainingCreationRepository extends JpaRepository<TrainingCreation, Long> {
	
	 @Query("SELECT t FROM TrainingCreation t INNER JOIN FETCH t.venues")
	    List<TrainingCreation> findAllTrainingsWithVenues();

}
