package com.codesnippet.springbootdemoapplication.Service;

import com.codesnippet.springbootdemoapplication.DTOs.EmployeeDTO;
import com.codesnippet.springbootdemoapplication.Entities.Employee;
import com.codesnippet.springbootdemoapplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class EmployeeService implements InitializingBean, DisposableBean {

    private final EmployeeRepository employeeRepository;

    EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        System.out.println("EmployeeService created");
    }


    //Using this we can Customize bean after bean creation
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("EmployeeService1 created");

    }
    public EmployeeDTO getEmployee(int id) {

        Employee employee = employeeRepository.getEmployee(id);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        return employeeDTO.EmployeeMapper(employee);

    }


    @Override
    public void destroy() throws Exception {
        System.out.println("EmployeeService destroyed");
    }
}
