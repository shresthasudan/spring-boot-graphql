package com.example.graphQl.graphQL.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphQl.entity.Designation;
import com.example.graphQl.service.DesignationService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Sudan
 **/
@Component
public class DesignationQuery implements GraphQLQueryResolver {

    private final DesignationService designationService;

    public DesignationQuery(DesignationService designationService) {
        this.designationService = designationService;
    }

    public List<Designation> designationList() {
        return designationService.getAllDesignation();
    }
}
