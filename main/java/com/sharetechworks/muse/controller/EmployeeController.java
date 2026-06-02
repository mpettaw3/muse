package com.sharetechworks.muse.controller;

import com.sharetechworks.muse.DOA.Employee;
import com.sharetechworks.muse.service.EmployeeService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService= employeeService;
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @PostMapping("/add")
    public Employee addEmployee(Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/delete")
    public void deleteEmployee(long id){
        employeeService.deleteEmployeeById(id);
    }

    @SneakyThrows
    @GetMapping("/findById")
    public Employee findEmployeeById(long id){
        Optional<Employee> employee = employeeService.findEmployeeById(id);
        if(employee.isPresent()){
            return employee.get();
        }else{
           throw new Exception("The id you used is not associated with an employee.");
        }

    }

    @GetMapping("/findByCompanyId")
    public List<Employee> findEmployeesByCompanyId(long companyId){
        return employeeService.findByCompanyId(companyId);
    }

    @GetMapping("/findByFullName")
    public List<Employee> findEmployeeByFullName(String lastname, String firstname){
        return employeeService.findByLastNameAndFirstName(lastname, firstname);
    }
}
