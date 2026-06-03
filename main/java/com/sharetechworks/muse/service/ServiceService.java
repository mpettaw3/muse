package com.sharetechworks.muse.service;

import com.sharetechworks.muse.repository.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;
    public ServiceService (ServiceRepository serviceRepository){
        this.serviceRepository = serviceRepository;
    }

    public List<com.sharetechworks.muse.DOA.Service> findAllServices(){
        return serviceRepository.findAll();
    }
    public List<com.sharetechworks.muse.DOA.Service> findServiceByCompanyId(long companyId){
        return serviceRepository.findServiceByCompanyId(companyId);
    }
    public Optional<com.sharetechworks.muse.DOA.Service> findServiceByTitleAndCompanyId(String title, long id){
        return serviceRepository.findServiceByTitleAndCompanyId(title, id);
    }
    public Optional<com.sharetechworks.muse.DOA.Service> findServiceById(long id){
        return serviceRepository.findById(id);
    }

    public com.sharetechworks.muse.DOA.Service saveService(com.sharetechworks.muse.DOA.Service service){
        return serviceRepository.save(service);
    }
    public void deleteServiceById(long id){
        serviceRepository.deleteById(id);
    }
}
