package com.codesnippet.springbootdemoapplication.Service;

import com.codesnippet.springbootdemoapplication.DTOs.EmployeeDTO;
import com.codesnippet.springbootdemoapplication.Entities.Employee;
import com.codesnippet.springbootdemoapplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeDTO getEmployee(int id) {

        Employee employee = employeeRepository.getEmployee(id);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        return employeeDTO.EmployeeMapper(employee);

    }
}
