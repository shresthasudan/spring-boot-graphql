package com.example.graphQl.repo;

import com.example.graphQl.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sudan
 **/

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
