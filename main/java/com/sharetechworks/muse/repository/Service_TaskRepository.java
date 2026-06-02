package com.sharetechworks.muse.repository;
import com.sharetechworks.muse.DOA.Service_Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Service_TaskRepository extends JpaRepository<Service_Task, Long>{
    List<Service_Task> findService_TaskByCompanyIdAndServiceId(long companyId, long serviceId);
}
