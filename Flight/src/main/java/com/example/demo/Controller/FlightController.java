package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Flight;
import com.example.demo.service.FlightService;

@RestController
public class FlightController {
	@Autowired
	private FlightService service;

	@GetMapping("/getall")
	public List<Flight> getAllFlights() {
		return this.service.getAllFlights();
	}

	@GetMapping("/getall/{fid}")
	public Flight getById(@PathVariable String fid) {
		return this.service.getFlightById(Integer.parseInt(fid));
	}

	@PostMapping("/add")
	public Flight addFlight(@RequestBody Flight flight) {
		return this.service.addFlight(flight);
	}

	@DeleteMapping("/delete/{fid}")
	public void deleteFlightById(@PathVariable String fid) {
		service.deleteFlightById(Integer.parseInt(fid));
	}

	@PutMapping("/update")
	public Flight update(@RequestBody Flight flight) {
		return this.service.updateFlightById(flight);
	}
}
