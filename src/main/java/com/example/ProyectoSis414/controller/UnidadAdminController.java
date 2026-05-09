package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.UnidadAdmin;
import com.example.ProyectoSis414.service.UnidadAdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unidadadmin")
public class UnidadAdminController {

    private final UnidadAdminService service;

    public UnidadAdminController(UnidadAdminService service) {
        this.service = service;
    }

    @GetMapping
    public List<UnidadAdmin> listar() {
        return service.listar();
    }

    @PostMapping
    public UnidadAdmin guardar(@RequestBody UnidadAdmin unidadAdmin) {
        return service.guardar(unidadAdmin);
    }
}