package com.sharetechworks.muse.repository;

import com.sharetechworks.muse.DOA.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
    Optional<Client> findByLastNameAndFirstName(String lastName, String firstName);
    List<Client> findByCompanyId(long companyId);
}
