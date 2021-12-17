package com.litvishko.spring.mvc_hibernate_crud.controller;

import com.litvishko.spring.mvc_hibernate_crud.dao.EmployeeDAO;
import com.litvishko.spring.mvc_hibernate_crud.entity.Employee;
import com.litvishko.spring.mvc_hibernate_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {

        model.addAttribute("allEmps", employeeService.showAllEmps());

        return "all-emps-view";

    }

    @RequestMapping("/addEmp")
    public String addNewEmployee(Model model) {
        Employee emp = new Employee();
        model.addAttribute("employee", emp);

        return "add-emp-view";
    }

    @RequestMapping("/showNewEmps")
    public String showNewEmployees(@ModelAttribute("employee") Employee employee) {

        employeeService.addEmp(employee);

        return "redirect:/";
    }

}
