package com.usa.misiontic.reto3.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usa.misiontic.reto3.reto3.entities.Client;
import com.usa.misiontic.reto3.reto3.repository.ClientRepository;

@Service
public class ClientService {


    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }
    public Optional<Client> getClient(int id){
        return clientRepository.getClient(id);
    }
    public Client save(Client p){
        if(p.getIdClient() == null){
            return clientRepository.save(p);
        }else{
            Optional<Client> e = clientRepository.getClient(p.getIdClient());
            if(e.isPresent()){
                return e.get();
            }else{
                return clientRepository.save(p);
            }
        }

    }

    public Client update(Client p){
        if(p.getIdClient() != null){
            Optional<Client> q = clientRepository.getClient(p.getIdClient());
            if(q.isPresent()){
                if(p.getName() != null){
                    q.get().setName(p.getName());
                }
                clientRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
Optional<Client>p=clientRepository.getClient(id);
if(p.isPresent()){
    clientRepository.delete(p.get());
    flag=true;
}


        return flag;
    }
}
