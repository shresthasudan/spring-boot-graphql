package com.example.graphQl.service;

import com.example.graphQl.entity.Designation;
import com.example.graphQl.repo.DesignationRepo;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Sudan
 **/
@Service
public class DesignationService {

    private final DesignationRepo designationRepo;

    public DesignationService(DesignationRepo designationRepo) {
        this.designationRepo = designationRepo;
    }

    public List<Designation> getAllDesignation() {
        List<Designation> designations = designationRepo.findAll();
        return designations;
    }

    public Designation insertDesignation(Designation d){
        return designationRepo.save(d);
    }

    public Designation getDesignationById(Long id) {
        return designationRepo.getById(id);
    }

}
