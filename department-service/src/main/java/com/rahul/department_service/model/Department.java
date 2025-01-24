package com.rahul.department_service.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Long id;
    private String name;
    private List<Employee> employees = new ArrayList<>();
}
