package com.example.Lab04_NguyenThanhLuan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Lab04_NguyenThanhLuan.entity.*;

import java.util.List;

@Repository
public interface PlaneRepository extends JpaRepository<plane, Integer>{
    @Query(value = "select p from plane p where p.TamBay > 10000")
    public List<plane> lstPlane();
}
