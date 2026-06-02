package com.sharetechworks.muse.repository;
import com.sharetechworks.muse.DOA.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByCompanyId(long id);
    List<Employee> findByLastNameAndFirstName(String lastName, String firstName);
}
