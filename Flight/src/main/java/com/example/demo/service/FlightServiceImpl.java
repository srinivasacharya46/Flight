package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FlightDao;
import com.example.demo.entity.Flight;

@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightDao flightDao;

	@Override
	public List<Flight> getAllFlights() {

		return flightDao.findAll();
	}

	@Override
	public Flight getFlightById(Integer id) {

		return flightDao.getOne(id);
	}

	@Override
	public void deleteFlightById(int id) {
		Flight entity = flightDao.getOne(id);
		flightDao.delete(entity);

	}

	@Override
	public Flight updateFlightById(Flight flight) {

		flightDao.save(flight);
		return flight;
	}

	@Override
	public Flight addFlight(Flight flight) {

		return flightDao.save(flight);

	}

}
