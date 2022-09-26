package com.example.Lab04_NguyenThanhLuan.service;


import com.example.Lab04_NguyenThanhLuan.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public void getEmployee() {
        employeeRepository.listEmp().forEach(System.out::println);
    }
}

