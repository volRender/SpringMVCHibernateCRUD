package com.litvishko.spring.mvc_hibernate_crud.controller;

import com.litvishko.spring.mvc_hibernate_crud.dao.EmployeeDAO;
import com.litvishko.spring.mvc_hibernate_crud.entity.Employee;
import com.litvishko.spring.mvc_hibernate_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/updateInfo")
    public String updateEmpInfo(@RequestParam("empId") int id, Model model) {
        Employee employee = new Employee();
        employee = employeeService.showEmp(id);

        model.addAttribute("employee", employee);

        return "add-emp-view";
    }

    @RequestMapping("/deleteEmp")
    public String deleteEmp(@RequestParam("empId") int id) {
        employeeService.deleteEmp(id);
        return "redirect:/";
    }

}
