package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Flight;

@Service
public interface FlightDao extends JpaRepository<Flight, Integer> {

}
