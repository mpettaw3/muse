package com.sharetechworks.muse.repository;
import com.sharetechworks.muse.DOA.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
//import java.util.List;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long>{
    List<Assignment> findByCompanyId(long companyId);
    List<Assignment> findByClientId(long clientId);
    List<Assignment> findByEmployeeId(long employeeId);
    List<Assignment> findByServiceId(long serviceId);
}
