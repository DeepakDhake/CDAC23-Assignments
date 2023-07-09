package com.app.Service;

import java.util.List;

import com.app.Entities.Railway;
import com.app.Entities.TrainCategory;

public interface RailwayService {
	List<Railway> getAllTrains();
	
	Railway addNewTrain(Railway newTrain);
	
	String addTrain(Railway newTrain);
	
	String removeTrainUsingId(Long trainId);
	
	List<Railway> getTrainByCat(TrainCategory cName);
	
	Railway UpdateTrainData(Railway upTrain);
}
