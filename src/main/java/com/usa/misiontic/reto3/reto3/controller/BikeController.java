package com.usa.misiontic.reto3.reto3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usa.misiontic.reto3.reto3.entities.Bike;
import com.usa.misiontic.reto3.reto3.service.BikeService;


@RestController
@RequestMapping("/api/Bike")
public class BikeController {

    @Autowired
    private BikeService bikeService;

    @GetMapping("/all")
    public List<Bike> getAll(){
        return bikeService.getAll();
    }
    @PostMapping("/save")
    public Bike save(@RequestBody Bike p){
        return bikeService.save(p);
    }
}
