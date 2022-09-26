package com.example.Lab04_NguyenThanhLuan;

import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.Lab04_NguyenThanhLuan.service.*;

@SpringBootApplication
public class Lab04NguyenThanhLuanApplication {
	final FlightService flightService ;
    final PlaneService planeService;
    final EmployeeService employeeService;
    
	public Lab04NguyenThanhLuanApplication(FlightService flightService, PlaneService planeService, EmployeeService employeeService) {
		super();
		this.flightService = flightService;
		this.planeService = planeService;
		this.employeeService = employeeService;
	}
	public static void main(String[] args) {
		SpringApplication.run(Lab04NguyenThanhLuanApplication.class, args);  
	}
	 @PostConstruct
	    void postConstruct(){
	 }
}

