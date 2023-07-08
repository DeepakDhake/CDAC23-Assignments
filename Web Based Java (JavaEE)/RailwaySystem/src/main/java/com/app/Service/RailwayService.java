package com.app.Service;

import java.util.List;

import com.app.Entities.Railway;

public interface RailwayService {
	List<Railway> getAllTrains();
	
	Railway addNewTrain(Railway newTrain);
	
	String addTrain(Railway newTrain);
	
	String removeTrainUsingId(Long trainId);
}
