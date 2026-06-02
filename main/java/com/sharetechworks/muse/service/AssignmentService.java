package com.sharetechworks.muse.service;

import com.sharetechworks.muse.DOA.Assignment;
import com.sharetechworks.muse.repository.AssignmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssignmentService {
    private final AssignmentRepository assignmentRepository;
    public AssignmentService (AssignmentRepository assignmentRepository){
        this.assignmentRepository = assignmentRepository;
    }

    public List<Assignment> findAllAssignments(){
        return assignmentRepository.findAll();
    }


    public List<Assignment> findByCompanyId(long companyId){
        return assignmentRepository.findByCompanyId(companyId);
    }
    public List<Assignment> findByClientId(long clientId){
        return assignmentRepository.findByClientId(clientId);
    }

    public List<Assignment> findByEmployeeId(long employeeId){
        return assignmentRepository.findByEmployeeId(employeeId);
    }


    public List<Assignment> findByServiceId(long serviceId){
        return assignmentRepository.findByServiceId(serviceId);
    }

    public Optional<Assignment> findAssignmentById(long id){
        return assignmentRepository.findById(id);
    }

    public Assignment saveAssignment(Assignment assignment){
        return assignmentRepository.save(assignment);
    }

    public void deleteAssignmentById(long id){
        assignmentRepository.deleteById(id);
    }
}
