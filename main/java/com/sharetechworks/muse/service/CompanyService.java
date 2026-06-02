package com.sharetechworks.muse.service;

import com.sharetechworks.muse.DOA.Company;
import com.sharetechworks.muse.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    public CompanyService (CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }
    public List<Company> findAllCompanies(){
        return companyRepository.findAll();
    }
    public List<Company> findCompanyByTitle(String title){
        return companyRepository.findCompanyByTitle(title);
    }

    public Optional<Company> findCompanyByEmail(String email){
        return companyRepository.findCompanyByEmail(email);
    }

    public Optional<Company> findCompanyById(long id){
        return companyRepository.findById(id);
    }
    public Company saveCompany(Company company){
        return companyRepository.save(company);
    }
    public void deleteCompanyById(long id){
        companyRepository.deleteById(id);
    }
}
