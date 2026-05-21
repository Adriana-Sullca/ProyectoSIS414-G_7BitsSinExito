package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.Mes;
import com.example.ProyectoSis414.service.MesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meses")
@CrossOrigin(origins = "*")
public class MesController {

    private final MesService mesService;

    public MesController(MesService mesService) {
        this.mesService = mesService;
    }

    @GetMapping
    public List<Mes> obtenerTodos() {
        return mesService.obtenerTodos();
    }

    @PostMapping
    public Mes agregar(@RequestBody Mes mes) {
        return mesService.agregar(mes);
    }

    @PutMapping("/{id}")
    public Mes actualizar(@PathVariable Long id, @RequestBody Mes mes) {
        return mesService.actualizar(id, mes);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        boolean eliminado = mesService.eliminar(id);
        return eliminado ? "Mes eliminado" : "Mes no encontrado";
    }
}