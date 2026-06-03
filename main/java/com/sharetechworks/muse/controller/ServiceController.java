package com.sharetechworks.muse.controller;

import com.sharetechworks.muse.DOA.Service;
import com.sharetechworks.muse.service.ServiceService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/service")
public class ServiceController {
    private final ServiceService sService;
    public ServiceController(ServiceService sService){
        this.sService = sService;
    }

    @GetMapping("/all")
    public List<Service> getAllServices(){return sService.findAllServices();}

    @PostMapping("/add")
    public Service addService(Service service){
        return sService.saveService(service);
    }

    @GetMapping("/delete")
    public void deleteService(long id){
        sService.deleteServiceById(id);
    }

    @SneakyThrows
    @GetMapping("/findById")
    public Service findServiceById(long id){
        Optional<Service> service = sService.findServiceById(id);
        if(service.isPresent()){
            return service.get();
        }else{
            throw new Exception("No Service was found with associated id");
        }
    }

    @GetMapping("/findByCompanyId")
    public List<Service> findServiceByCompanyId(long companyId){
        return sService.findServiceByCompanyId(companyId);
    }

    @SneakyThrows
    @GetMapping("/findByCompanyIdAndTitle")
    public Service findServiceByCompanyIdAndTitle(String title, long companyId){
        Optional<Service> s =sService.findServiceByTitleAndCompanyId(title, companyId);
        if(s.isPresent()){
            return s.get();
        }else{
            throw new Exception("We could not find a service with that title and companyId");
        }
    }
}
