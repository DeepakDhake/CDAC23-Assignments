package com.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Railway;
import com.app.Entities.TrainCategory;

public interface RailwayRepository extends JpaRepository<Railway, Long> {
	List<Railway> findByCategory(TrainCategory cName);
}
