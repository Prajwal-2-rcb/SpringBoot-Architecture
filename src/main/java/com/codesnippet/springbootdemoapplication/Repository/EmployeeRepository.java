package com.codesnippet.springbootdemoapplication.Repository;

import com.codesnippet.springbootdemoapplication.Entities.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public Employee getEmployee(int id){
        return new Employee(1,"Prajwal","SE",21);
    }


}
