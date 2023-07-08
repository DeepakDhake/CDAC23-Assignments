package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Railway;

public interface RailwayRepository extends JpaRepository<Railway, Long> {
	
}
