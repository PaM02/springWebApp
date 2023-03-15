package com.openclassrooms.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.openclassrooms.webapp.model.Employee;
import com.openclassrooms.webapp.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Employee> listEmployee = service.getEmployees();
        model.addAttribute("employees", listEmployee);

        return "home";
    }

}