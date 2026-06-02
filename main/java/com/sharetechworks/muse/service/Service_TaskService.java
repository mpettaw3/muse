package com.sharetechworks.muse.service;

import com.sharetechworks.muse.DOA.Service_Task;
import com.sharetechworks.muse.repository.Service_TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Service_TaskService {
    private final Service_TaskRepository serviceTaskRepository;
    public Service_TaskService (Service_TaskRepository serviceTaskRepository){
        this.serviceTaskRepository = serviceTaskRepository;
    }
    public List<Service_Task> findAllServiceTasks(){
        return serviceTaskRepository.findAll();
    }
    public List<Service_Task> findService_TaskByCompanyIdAndServiceId(long companyId, long serviceId){
        return serviceTaskRepository.findService_TaskByCompanyIdAndServiceId(companyId, serviceId);
    }

    public Optional<Service_Task> findServiceById(long id){
        return serviceTaskRepository.findById(id);
    }

    public Service_Task saveServiceTask(Service_Task serviceTask){
        return serviceTaskRepository.save(serviceTask);
    }

    public void deleteServiceTaskById(long id){
        serviceTaskRepository.deleteById(id);
    }
}
