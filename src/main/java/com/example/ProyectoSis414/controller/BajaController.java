package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.entity.BajaEntity;
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
    public List<BajaEntity> obtenerTodas() {
        return bajaService.obtenerTodas();
    }

    @GetMapping("/filtrar")
    public List<BajaEntity> filtrar(
            @RequestParam(required = false) Integer codbaja,
            @RequestParam(required = false) String descbaja) {
        return bajaService.obtenerConFiltros(codbaja, descbaja);
    }

    @PostMapping
    public BajaEntity agregar(@RequestBody BajaEntity nuevaBaja) {
        return bajaService.agregar(nuevaBaja);
    }

    @PutMapping("/{codbaja}")
    public BajaEntity actualizar(
            @PathVariable int codbaja,
            @RequestBody BajaEntity bajaActualizada) {
        return bajaService.actualizar(codbaja, bajaActualizada);
    }

    @DeleteMapping("/{codbaja}")
    public String eliminar(@PathVariable int codbaja) {
        boolean eliminado = bajaService.eliminar(codbaja);
        return eliminado ? "Baja eliminada" : "Baja no encontrada";
    }
}

