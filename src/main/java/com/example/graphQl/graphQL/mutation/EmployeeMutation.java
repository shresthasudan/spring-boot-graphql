package com.example.graphQl.graphQL.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphQl.entity.Employee;
import com.example.graphQl.service.DesignationService;
import com.example.graphQl.service.EmployeeService;
import org.springframework.stereotype.Component;

/**
 * @author Sudan
 **/
@Component
public class EmployeeMutation implements GraphQLMutationResolver {

    private final EmployeeService employeeService;
    private final DesignationService designationService;

    public EmployeeMutation(EmployeeService employeeService, DesignationService designationService) {
        this.employeeService = employeeService;
        this.designationService = designationService;
    }

    public Employee insertEmployee(String firstname, String lastName, String phoneNo, String address, Long designation) {
        Employee employee = new Employee();
        employee.setFirstName(firstname);
        employee.setLastName(lastName);
        employee.setPhoneNo(phoneNo);
        employee.setAddress(address);
        employee.setDesignation(designationService.getDesignationById(designation));
        return employeeService.insertEmployee(employee);
    }
}
