package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Flight;

@Service
public interface FlightService {
	public List<Flight> getAllFlights();

	public Flight getFlightById(Integer id);

	public void deleteFlightById(int id);

	public Flight updateFlightById(Flight flight);

	public Flight addFlight(Flight flight);
}
