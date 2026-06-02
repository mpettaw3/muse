package com.sharetechworks.muse.repository;
import com.sharetechworks.muse.DOA.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findServiceByCompanyId(long companyId);
    List<Service> findServiceByTitleAndCompanyId(String title, long companyId);
}
