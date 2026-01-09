package com.codesnippet.springbootdemoapplication.DTOs;

import com.codesnippet.springbootdemoapplication.Entities.Employee;

public class EmployeeDTO {
    private String name;
    private String designation;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getDesignation() {
        return designation;
    }
    public Integer getAge() {
        return age;
    }
    public EmployeeDTO EmployeeMapper(Employee employee) {
        this.name=employee.getName();
        this.designation=employee.getDesignation();
        this.age=employee.getAge();
        return this;
    }
}
