package com.sharetechworks.muse.controller;

import com.sharetechworks.muse.DOA.Service_Task;
import com.sharetechworks.muse.service.Service_TaskService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/serviceTask")
public class Service_TaskController {
    private final Service_TaskService serviceTaskService;
    public Service_TaskController(Service_TaskService serviceTaskService){
        this.serviceTaskService = serviceTaskService;
    }

    @GetMapping("/all")
    public List<Service_Task> getAllServiceTasks(){
        return serviceTaskService.findAllServiceTasks();
    }

    @GetMapping("/add")
    public Service_Task addServiceTask(Service_Task serviceTask){
        return serviceTaskService.saveServiceTask(serviceTask);
    }

    @GetMapping("/delete")
    public void deleteServiceTask(long id){
        serviceTaskService.deleteServiceTaskById(id);
    }

    @SneakyThrows
    @GetMapping("/getServiceTaskById")
    public Service_Task getById(long id){
        Optional<Service_Task> serviceTask = serviceTaskService.findServiceById(id);
        if(serviceTask.isPresent()){
            return serviceTask.get();
        }else{
            throw new Exception("Was unable to find Service_Task by id");
        }
    }
     @GetMapping("/findByCompanyAndServiceId")
    public List<Service_Task> findByCompanyAndServiceId(long companyId, long serviceId){
        return serviceTaskService.findService_TaskByCompanyIdAndServiceId(companyId, serviceId);
     }

}
