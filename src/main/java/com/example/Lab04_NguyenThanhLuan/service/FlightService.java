package com.example.Lab04_NguyenThanhLuan.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Lab04_NguyenThanhLuan.repository.*;

@Service
@Transactional
public class FlightService {
	@Autowired 
	private FlightRepository flightRepository;
	
	public FlightRepository getFlightRepo() {
		return flightRepository;
	}
	
	public void getAllFlight() {
		flightRepository.lstSearchFlight().forEach(System.out::println);
	}
}