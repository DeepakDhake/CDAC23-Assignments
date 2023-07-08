package com.app.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entities.Railway;
import com.app.Repository.RailwayRepository;

@Service
@Transactional
public class RailwayServiceImpl implements RailwayService {

	@Autowired
	private RailwayRepository railRepo;

	@Override
	public List<Railway> getAllTrains() {
		// TODO Auto-generated method stub
		return railRepo.findAll();
	}

	@Override
	public Railway addNewTrain(Railway newTrain) {
		// TODO Auto-generated method stub
		return railRepo.save(newTrain);
	}

	@Override
	public String addTrain(Railway newTrain) {
		// TODO Auto-generated method stub
		String mesg = "Failed  to add new Train";
		if(newTrain != null)
		{
			railRepo.save(newTrain);
			return mesg = "New Train added Sucessfully";
		}
		return mesg;
	}

	@Override
	public String removeTrainUsingId(Long trainId) {
		// TODO Auto-generated method stub
		String mesg = "Failed to delete the train";
		if(railRepo.existsById(trainId))
		{
			railRepo.deleteById(trainId);
			return mesg = "Train with " + trainId + " Deleted";
		}
		return mesg;
	}

}
