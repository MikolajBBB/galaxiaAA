package com.example.demo.Services;

import com.example.demo.Entities.Client;
import com.example.demo.Repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ClientService {
    @Autowired
    private ClientRepo clientRepo;

    public ClientService() {
    }

    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    public List<Client> findAll() {
        return clientRepo.findAll();
    }

    public void save(Client client) {
        clientRepo.save(client);
    }
}
