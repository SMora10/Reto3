package com.usa.misiontic.reto3.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.usa.misiontic.reto3.reto3.entities.Bike;
import com.usa.misiontic.reto3.reto3.repository.crudRepository.BikeCrudRepository;


@Repository
public class BikeRepository {

    @Autowired
    private BikeCrudRepository bikeCrudRepository;

    public List<Bike> getAll(){
        return (List<Bike>) bikeCrudRepository.findAll();
    }

    public Optional<Bike> getBike(int id){
        return bikeCrudRepository.findById(id);
    }

    public Bike save(Bike c){
        return bikeCrudRepository.save(c);
    }
    public void delete(Bike c){
    bikeCrudRepository.delete(c);
    }
}
