package com.sharetechworks.muse.controller;

import com.sharetechworks.muse.DOA.Assignment;
import com.sharetechworks.muse.service.AssignmentService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/assignment")
public class AssignmentController {

    private final AssignmentService assignmentService;
    public AssignmentController(AssignmentService assignmentService){
        this.assignmentService = assignmentService;
    }

    @GetMapping("/all")
    public List<Assignment> getAllAssignments(){
        return assignmentService.findAllAssignments();
    }

    @PostMapping("/add")
    public Assignment addAssignment(Assignment assignment){
        return assignmentService.saveAssignment(assignment);
    }
    @GetMapping("/delete")
    public void deleteAssignmentById(long id){
        assignmentService.deleteAssignmentById(id);
    }

    @GetMapping("/findByCompanyId")
    public List<Assignment> findByCompanyId(long companyId){
        return assignmentService.findByCompanyId(companyId);
    }
    @GetMapping("/findByEmployeeId")
    public List<Assignment> findByEmployeeId(long employeeId){
        return assignmentService.findByEmployeeId(employeeId);
    }
    @GetMapping("/findByClientId")
    public List<Assignment> findByClientId(long clientId){
        return assignmentService.findByClientId(clientId);
    }
    @GetMapping("/findByServiceId")
    public List<Assignment> findByServiceId(long serviceId){
        return assignmentService.findByServiceId(serviceId);
    }

    @SneakyThrows
    @GetMapping("/findById")
    public Assignment findById(long id){
        Optional<Assignment> item = assignmentService.findAssignmentById(id);
        if(item.isPresent()){
            return item.get();
        }else{
            throw new Exception("Could not find an assignment for the id");
        }
    }


    
}
