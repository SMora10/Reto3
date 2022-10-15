package com.usa.misiontic.reto3.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usa.misiontic.reto3.reto3.entities.Bike;
import com.usa.misiontic.reto3.reto3.entities.Category;
import com.usa.misiontic.reto3.reto3.repository.BikeRepository;
import com.usa.misiontic.reto3.reto3.repository.CategoryRepository;

@Service
public class BikeService {


    @Autowired
    private BikeRepository bikeRepository;

    public List<Bike> getAll(){
        return bikeRepository.getAll();
    }
    public Optional<Bike> getProduct(int id){
        return bikeRepository.getBike(id);
    }
    public Bike save(Bike p){
        if(p.getId() == null){
            return bikeRepository.save(p);
        }else{
            Optional<Bike> e = bikeRepository.getBike(p.getId());
            if(e.isPresent()){
                return e.get();
            }else{
                return bikeRepository.save(p);
            }
        }

    }

    public Bike update(Bike p){
        if(p.getId() != null){
            Optional<Bike> q = bikeRepository.getBike(p.getId());
            if(q.isPresent()){
                if(p.getName() != null){
                    q.get().setName(p.getName());
                }
                if(p.getBrand() != null){
                    q.get().setBrand(p.getBrand());
                }
                if(p.getDescription() != null){
                    q.get().setDescription(p.getDescription());
                }
                if(p.getCategory() != null){
                    q.get().setCategory(p.getCategory());
                }
                bikeRepository.save(q.get());
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
Optional<Bike>p=bikeRepository.getBike(id);
if(p.isPresent()){
    bikeRepository.delete(p.get());
    flag=true;
}


        return flag;
    }
}

