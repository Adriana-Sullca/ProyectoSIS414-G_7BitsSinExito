package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.Baja;
import com.example.ProyectoSis414.service.BajaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bajas")
@CrossOrigin(origins = "*")
public class BajaController {

    private final BajaService bajaService;

    public BajaController(BajaService bajaService) {
        this.bajaService = bajaService;
    }

    @GetMapping
    public List<Baja> obtenerTodos() {
        return bajaService.obtenerTodos();
    }

    @PostMapping
    public Baja agregar(@RequestBody Baja baja) {
        return bajaService.agregar(baja);
    }

    @PutMapping("/{id}")
    public Baja actualizar(@PathVariable Integer id, @RequestBody Baja baja) {
        return bajaService.actualizar(id, baja);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Integer id) {
        boolean eliminado = bajaService.eliminar(id);
        return eliminado ? "Baja eliminada" : "Baja no encontrada";
    }
}
