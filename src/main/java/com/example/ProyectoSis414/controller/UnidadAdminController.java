package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.UnidadAdmin;
import com.example.ProyectoSis414.service.UnidadAdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unidadadmin")
@CrossOrigin(origins = "*")
public class UnidadAdminController {

    private final UnidadAdminService unidadAdminService;

    public UnidadAdminController(UnidadAdminService unidadAdminService) {
        this.unidadAdminService = unidadAdminService;
    }

    @GetMapping
    public List<UnidadAdmin> obtenerTodos() {
        return unidadAdminService.obtenerTodos();
    }

    @PostMapping
    public UnidadAdmin agregar(@RequestBody UnidadAdmin unidadAdmin) {
        return unidadAdminService.agregar(unidadAdmin);
    }

    @PutMapping("/{id}")
    public UnidadAdmin actualizar(@PathVariable Long id,
                                  @RequestBody UnidadAdmin unidadAdmin) {
        return unidadAdminService.actualizar(id, unidadAdmin);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        unidadAdminService.eliminar(id);
    }
}