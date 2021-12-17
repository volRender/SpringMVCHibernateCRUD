package com.litvishko.spring.mvc_hibernate_crud.dao;

import com.litvishko.spring.mvc_hibernate_crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> showAllEmps();

}
