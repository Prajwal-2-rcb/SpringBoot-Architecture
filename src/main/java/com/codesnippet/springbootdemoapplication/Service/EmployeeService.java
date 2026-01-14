package com.codesnippet.springbootdemoapplication.Service;

import com.codesnippet.springbootdemoapplication.DTOs.EmployeeDTO;
import com.codesnippet.springbootdemoapplication.Entities.Employee;
import com.codesnippet.springbootdemoapplication.Repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class EmployeeService   {

    private final EmployeeRepository employeeRepository;

    EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        System.out.println("EmployeeService created");
    }


    //Using this we can Customize bean after bean creation

    public EmployeeDTO getEmployee(int id) {

        Employee employee = employeeRepository.getEmployee(id);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        return employeeDTO.EmployeeMapper(employee);

    }

    @PostConstruct
    public void init()
    {
        System.out.println("EmployeeService created");
    }

    @PreDestroy
    public void destry()
    {
        System.out.println("EmployeeService destroyed");
    }



}
