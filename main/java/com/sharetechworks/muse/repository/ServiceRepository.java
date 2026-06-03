package com.sharetechworks.muse.repository;
import com.sharetechworks.muse.DOA.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findServiceByCompanyId(long companyId);
    Optional<Service> findServiceByTitleAndCompanyId(String title, long companyId);
}
