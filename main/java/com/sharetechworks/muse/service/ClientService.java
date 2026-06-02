package com.sharetechworks.muse.service;

import com.sharetechworks.muse.DOA.Client;
import com.sharetechworks.muse.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService{
    private final ClientRepository clientRepository;
    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }
    public List<Client> findAllClients(){
        return clientRepository.findAll();
    }
    public Optional<Client> findByLastNameAndFirstName(String lastName, String firstName){
        return clientRepository.findByLastNameAndFirstName(lastName, firstName);
    }

    public List<Client> findByCompanyId(long companyId){
        return clientRepository.findByCompanyId(companyId);
    }

    public Optional<Client> findClientById(long id){
        return clientRepository.findById(id);
    }

    public Client saveClient(Client client){
        return clientRepository.save(client);
    }
    public void deleteClientById(long id){
        clientRepository.deleteById(id);
    }

}
