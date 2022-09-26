package com.example.Lab04_NguyenThanhLuan.repository;

import com.example.Lab04_NguyenThanhLuan.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<employee, String>{
    @Query(value = "select e from employee e where e.Luong < 10000")
    public List<employee> listEmp();
}
