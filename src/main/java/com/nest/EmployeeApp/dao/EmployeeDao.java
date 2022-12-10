package com.nest.EmployeeApp.dao;

import com.nest.EmployeeApp.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}