package com.sharetechworks.muse.service;

import com.sharetechworks.muse.DOA.Employee;
import com.sharetechworks.muse.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findByCompanyId(long companyId){
        return employeeRepository.findByCompanyId(companyId);
    }
    public List<Employee> findByLastNameAndFirstName(String lastName, String firstName){
        return employeeRepository.findByLastNameAndFirstName(lastName, firstName);
    }
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }
    public Optional<Employee> findEmployeeById(long id){
        return employeeRepository.findById(id);
    }
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployeeById(long id){
        employeeRepository.deleteById(id);
    }
}
