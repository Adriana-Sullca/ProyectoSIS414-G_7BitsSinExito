package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.Entidad;
import com.example.ProyectoSis414.service.EntidadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entidades")
public class EntidadController {

    private final EntidadService entidadService;

    public EntidadController(EntidadService entidadService) {
        this.entidadService = entidadService;
    }

    @GetMapping
    public List<Entidad> obtenerTodas() {
        return entidadService.obtenerTodas();
    }
    
    @GetMapping("/filtrar")
    public List<Entidad> filtrar(
            @RequestParam(required = false) Integer gestion,
            @RequestParam(required = false) String siglaEnt) {
        return entidadService.obtenerConFiltros(gestion, siglaEnt);
    }

    @PostMapping
    public Entidad agregar(@RequestBody Entidad entidad) {
        return entidadService.agregar(entidad);
    }

    @PutMapping("/{gestion}/{entidad}")
    public Entidad actualizar(
            @PathVariable int gestion,
            @PathVariable int entidad,
            @RequestBody Entidad entidadActualizada) {
        return entidadService.actualizar(gestion, entidad, entidadActualizada);
    }

    @DeleteMapping("/{gestion}/{entidad}")
    public String eliminar(@PathVariable int gestion, @PathVariable int entidad) {
        boolean eliminado = entidadService.eliminar(gestion, entidad);
        return eliminado ? "Entidad eliminada" : "Entidad no encontrada";
    }
}
