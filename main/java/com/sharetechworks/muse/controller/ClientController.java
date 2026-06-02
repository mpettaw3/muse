package com.sharetechworks.muse.controller;

import com.sharetechworks.muse.DOA.Client;
import com.sharetechworks.muse.service.ClientService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;
    public ClientController(ClientService clientService){this.clientService=clientService;}
    @GetMapping("/all")
    public List<Client> getAllClients(){return clientService.findAllClients();}
    @PostMapping("/add")
    public Client addClient(Client client){
        return clientService.saveClient(client);
    }
    @GetMapping("/delete")
    public void deleteClient(long id){
        clientService.deleteClientById(id);
    }

    @SneakyThrows
    @GetMapping("/findById")
    public Client findClientById(long id){
        Optional<Client> client =clientService.findClientById(id);
        if(client.isPresent()){
            return client.get();
        }else {
            throw new Exception("There is not a client associated with that id");
        }
    }

    @SneakyThrows
    @GetMapping("/findByFirstNameAndLastName")
    public Client findByFirstNameAndLastName(String lastName, String firstName){
        Optional<Client> client = clientService.findByLastNameAndFirstName(lastName, firstName);
        if(client.isPresent()){
            return client.get();
        }else{
            throw new Exception("Cannot find client by full name.");
        }

    }

    @GetMapping("/findByCompanyId")
    public List<Client> findByCompanyid(long companyId){
        return clientService.findByCompanyId(companyId);
    }
}
