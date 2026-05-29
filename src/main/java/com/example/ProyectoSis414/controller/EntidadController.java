package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.Entidad;
import com.example.ProyectoSis414.service.EntidadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entidades")
@CrossOrigin(origins = "*")
public class EntidadController {

    private final EntidadService entidadService;

    public EntidadController(EntidadService entidadService) {
        this.entidadService = entidadService;
    }

    @GetMapping
    public List<Entidad> obtenerTodas() {
        return entidadService.obtenerTodas();
    }

    @PostMapping
    public Entidad agregar(@RequestBody Entidad entidad) {
        return entidadService.agregar(entidad);
    }

    @PutMapping("/{id}")
    public Entidad actualizar(@PathVariable Long id, @RequestBody Entidad entidad) {
        return entidadService.actualizar(id, entidad);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        boolean eliminado = entidadService.eliminar(id);
        return eliminado ? "Entidad eliminada" : "Entidad no encontrada";
    }
}
