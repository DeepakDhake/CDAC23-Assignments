package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.Railway;
import com.app.Entities.TrainCategory;
import com.app.Service.RailwayService;

@RestController
@RequestMapping("/railways")
public class RailwayController {

	public RailwayController() {
		// TODO Auto-generated constructor stub
		System.out.println("In Railway Contoller" + getClass());
	}

	@Autowired
	private RailwayService railService;

	@GetMapping
	public List<Railway> seeAllTrains() {
		return railService.getAllTrains();
	}

	@PostMapping
	public ResponseEntity<?> saveNewTrain(@RequestBody Railway newTrain) {
		return new ResponseEntity<>(railService.addNewTrain(newTrain), HttpStatus.CREATED);
	}

	@PostMapping("/addTrainWithMessage")
	public ResponseEntity<?> saveNewTrainMessg(@RequestBody Railway newTrain) {
		return new ResponseEntity<>(railService.addTrain(newTrain), HttpStatus.CREATED);
	}

	@DeleteMapping("/{trainId}")
	public String removeTrain(@PathVariable Long trainId) {
		return railService.removeTrainUsingId(trainId);
	}

	@GetMapping("/TrainByCategory/{cName}")
	public List<Railway> getTrainsByCategory(String cName) {
		return railService.getTrainByCat(TrainCategory.valueOf(cName.toUpperCase()));
	}

	@PutMapping
	public Railway updateTrain(@RequestBody Railway upTrain) {
		return railService.UpdateTrainData(upTrain);
	}

}
