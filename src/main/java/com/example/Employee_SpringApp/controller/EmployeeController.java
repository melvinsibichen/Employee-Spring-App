package com.nest.EmployeeApp.controller;

import com.nest.EmployeeApp.dao.EmployeeDao;
import com.nest.EmployeeApp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Employee App";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add", consumes = "application/json", produces = "application/json")
    public String AddEmployee(@RequestBody Employee e){
        System.out.println(e.getEmpcode());
        System.out.println(e.getEmpname());
        System.out.println(e.getDesignation());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyname());
        System.out.println(e.getMobile());
        System.out.println(e.getUsername());
        System.out.println(e.getPassword());
        dao.save(e);
        return "Welcome to Employee Add Page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/search")
    public String SearchEmployee(){
        return "Welcome to Employee Search Page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public String DeleteEmployee(){
        return "Welcome to Employee Delete Page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/edit")
    public String EditEmployee(){
        return "Welcome to Employee Edit Page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Employee> ViewAllEmployee(){
        return (List<Employee>) dao.findAll();
    }
}