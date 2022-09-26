package com.example.Lab04_NguyenThanhLuan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Lab04_NguyenThanhLuan.entity.*;

@Repository
public interface FlightRepository extends JpaRepository<flight, String>{
	// Cho biết các chuyến bay đi Đà Lạt (DAD).
		@Query(value = "select f from flight f where f.GaDen='DAD'")
		public List<flight> lstSearchFlight();
}

