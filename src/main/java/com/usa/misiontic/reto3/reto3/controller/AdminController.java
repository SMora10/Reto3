package com.usa.misiontic.reto3.reto3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usa.misiontic.reto3.reto3.entities.Bike;
import com.usa.misiontic.reto3.reto3.entities.Score;
import com.usa.misiontic.reto3.reto3.service.AdminService;
import com.usa.misiontic.reto3.reto3.service.BikeService;
import com.usa.misiontic.reto3.reto3.service.ScoreService;


@RestController
@RequestMapping("/api/Score")
public class AdminController {

    @Autowired
    private AdminService adminService;

   /*  @GetMapping("/all")
    public List<Score> getAll(){
        return scoreService.getAll();
    }
    @PostMapping("/save")
    public Score save(@RequestBody Score p){
        return scoreService.save(p);
    }*/
}
