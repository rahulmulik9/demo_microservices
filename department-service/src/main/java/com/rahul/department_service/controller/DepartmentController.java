package com.rahul.department_service.controller;

import com.rahul.department_service.model.Department;
import com.rahul.department_service.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping
    public Department add(@RequestBody Department theDepartment){
        LOGGER.info("Department added : {}", theDepartment);
        return departmentRepository.addDepartment(theDepartment);
    }

    @GetMapping
    public List<Department> findAll(){
        LOGGER.info("Department get all");
        return departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id){
        LOGGER.info("Department found: {}", id);
        return departmentRepository.findById(id);
    }

}
