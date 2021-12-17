package com.litvishko.spring.mvc_hibernate_crud.controller;

import com.litvishko.spring.mvc_hibernate_crud.dao.EmployeeDAO;
import com.litvishko.spring.mvc_hibernate_crud.entity.Employee;
import com.litvishko.spring.mvc_hibernate_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    private String showAllEmployees(Model model) {

        model.addAttribute("allEmps", employeeService.showAllEmps());

        return "all-emps-view";

    }

}
