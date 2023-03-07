package com.example.demo.Controller;

import com.example.demo.Entities.Client;
import com.example.demo.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    private ClientService clientService;

    private Client client;

    @GetMapping("/clients")
    public List<Client> all() {
        return clientService.findAll();
    }

    @PostMapping("/saveClient")
    public void saveClient(@RequestBody Client client){
        this.clientService.save(client);
        //clientService.save(client);
    }

}
