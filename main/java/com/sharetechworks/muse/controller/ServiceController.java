package com.sharetechworks.muse.controller;

import com.sharetechworks.muse.DOA.Service;
import com.sharetechworks.muse.service.ServiceService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
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

    @GetMapping("/findByCompanyIdAndTitle")
    public List<Service> findServiceByCompanyIdAndTitle(String title, long companyId){
        return sService.findServiceByTitleAndCompanyId(title, companyId);
    }
}
