package com.usa.misiontic.reto3.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.usa.misiontic.reto3.reto3.entities.Client;
import com.usa.misiontic.reto3.reto3.repository.crudRepository.ClientCrudRepository;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }

    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }

    public Client save(Client c){
        return clientCrudRepository.save(c);
    }
    public void delete(Client c){
    clientCrudRepository.delete(c);
    }
}