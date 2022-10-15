package com.usa.misiontic.reto3.reto3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.usa.misiontic.reto3.reto3.repository.AdminRepository;


@Service
public class AdminService {


    @Autowired
    private AdminRepository adminRepository;

}

