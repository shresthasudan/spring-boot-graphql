package com.example.graphQl.graphQL.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphQl.entity.Employee;
import com.example.graphQl.service.EmployeeService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Sudan
 **/

@Component
public class EmployeeQuery implements GraphQLQueryResolver {

    private final EmployeeService employeeService;

    public EmployeeQuery(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public List<Employee> employeeList() {
        return employeeService.fetchAllEmployee();
    }

    public Employee employeeById(Long id) {
        return employeeService.fetchEmployeeById(id);
    }
}
