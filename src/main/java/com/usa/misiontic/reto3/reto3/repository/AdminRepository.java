package com.usa.misiontic.reto3.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.usa.misiontic.reto3.reto3.entities.Admin;
import com.usa.misiontic.reto3.reto3.repository.crudRepository.AdminCrudRepository;


@Repository
public class AdminRepository {

    @Autowired
    private AdminCrudRepository adminCrudRepository;

    public List<Admin> getAll(){
        return (List<Admin>) adminCrudRepository.findAll();
    }

    public Optional<Admin> getScore(int id){
        return adminCrudRepository.findById(id);
    }

    public Admin save(Admin c){
        return adminCrudRepository.save(c);
    }
    public void delete(Admin c){
    adminCrudRepository.delete(c);
    }
}
