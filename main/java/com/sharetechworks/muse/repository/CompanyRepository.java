package com.sharetechworks.muse.repository;
import com.sharetechworks.muse.DOA.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{
    List<Company> findCompanyByTitle(String title);
    Optional<Company> findCompanyByEmail(String email);
}
