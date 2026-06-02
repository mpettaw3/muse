package com.sharetechworks.muse.controller;

import com.sharetechworks.muse.DOA.Company;
import com.sharetechworks.muse.service.CompanyService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/company")
public class CompanyController {
    private final CompanyService companyService;
    public CompanyController(CompanyService companyService){
        this.companyService=companyService;
    }
    @GetMapping("/all")
    public List<Company> getAllCompanies(){
        return companyService.findAllCompanies();
    }

    @PostMapping("/add")
    public Company addCompany(Company company){
        return companyService.saveCompany(company);
    }

    @GetMapping("/delete")
    public void deleteCompany(long id){
        companyService.deleteCompanyById(id);
    }

    @SneakyThrows
    @GetMapping("/findCompanyById")
    public Company findCompanyById(long id){
        Optional<Company>  company = companyService.findCompanyById(id);
        if(company.isPresent()){
            return company.get();
        }else{
            throw new Exception("The id you used is not associated with a company.");
        }
    }

    @GetMapping("/findByTitle")
    public List<Company> findByTitle(String title){
        return companyService.findCompanyByTitle(title);
    }

    @SneakyThrows
    @GetMapping("/findByEmail")
    public Company findByEmail(String email){
        Optional<Company> company = companyService.findCompanyByEmail(email);
        if(company.isPresent()){
            return company.get();
        }else{
            throw new Exception("The email you used is not associated with a company");
        }
    }
}
