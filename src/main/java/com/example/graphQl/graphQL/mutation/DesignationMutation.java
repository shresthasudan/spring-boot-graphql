package com.example.graphQl.graphQL.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphQl.entity.Designation;
import com.example.graphQl.service.DesignationService;
import org.springframework.stereotype.Component;

/**
 * @author Sudan
 **/
@Component
public class DesignationMutation implements GraphQLMutationResolver {

    private final DesignationService designationService;

    public DesignationMutation(DesignationService designationService) {
        this.designationService = designationService;
    }

    public Designation insertDesignation(String name, String type, String department, String salary) {
        Designation designation = new Designation();
        designation.setName(name);
        designation.setType(type);
        designation.setDepartment(department);
        designation.setSalary(salary);
        return designationService.insertDesignation(designation);
    }
}
