package com.litvishko.spring.mvc_hibernate_crud.service;

import com.litvishko.spring.mvc_hibernate_crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> showAllEmps();
    void addEmp(Employee employee);
    Employee showEmp(int id);
    void deleteEmp(int id);

}
