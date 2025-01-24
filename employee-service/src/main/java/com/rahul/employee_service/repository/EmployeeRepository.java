package com.rahul.employee_service.repository;


import com.rahul.employee_service.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();


    public Employee addEmployee(Employee theEmployee) {
        employees.add(theEmployee);
        return theEmployee;
    }

    public Employee findById(Long theId) {
        return employees.stream()
                .filter(employee -> employee.id().equals(theId))
                .findFirst()
                .orElseThrow();

    }

    public List<Employee> findAll(){return employees;}

    public Employee findByDeptId(Long id){
        return employees.stream()
                .filter(employee -> employee.departmentId().equals(id))
                .findFirst()
                .orElseThrow();
    }
}
