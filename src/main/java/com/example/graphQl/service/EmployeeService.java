package com.example.graphQl.service;

import com.example.graphQl.entity.Employee;
import com.example.graphQl.repo.EmployeeRepo;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Sudan
 **/
@Service
public class EmployeeService {

    public final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

//    public List<EmployeeDto> fetchAllEmployee() {
//        List<Employee> employees = employeeRepo.findAll();
//        return employeeList(employees);
//    }

    public List<Employee> fetchAllEmployee() {
        List<Employee> employees = employeeRepo.findAll();
        return employees;
    }

//    public EmployeeDto fetchEmployeeById(Long id) {
//       Employee e = employeeRepo.getById(id);
//       return employeeToDto(e);
//    }

    public Employee fetchEmployeeById(Long id) {
        Employee e = employeeRepo.getById(id);
        return e;
    }

    public Employee insertEmployee(Employee e) {
        return employeeRepo.save(e);
    }

}
