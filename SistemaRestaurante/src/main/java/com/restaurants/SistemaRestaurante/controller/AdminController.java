package com.restaurants.SistemaRestaurante.controller;

import com.restaurants.SistemaRestaurante.domain.Horarios;
import com.restaurants.SistemaRestaurante.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {


    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping
    public void newTable(Horarios horarios){
        adminService.postNewTable(horarios);
    }
}
