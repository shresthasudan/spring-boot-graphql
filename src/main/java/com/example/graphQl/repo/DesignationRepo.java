package com.example.graphQl.repo;

import com.example.graphQl.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sudan
 *
 **/
@Repository
public interface DesignationRepo extends JpaRepository<Designation, Long> {
}
