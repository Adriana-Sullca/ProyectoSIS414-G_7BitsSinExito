package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.Mes;
import com.example.ProyectoSis414.service.MesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meses")
public class MesController {

    private final MesService mesService;

    public MesController(MesService mesService) {
        this.mesService = mesService;
    }

    @GetMapping
    public List<Mes> obtenerTodos() {
        return mesService.obtenerTodos();
    }

    // http://localhost:8080/meses/filtrar?mes=1&nommes=Enero
    @GetMapping("/filtrar")
    public List<Mes> filtrar(
            @RequestParam(required = false) Integer mes,
            @RequestParam(required = false) String nommes) {
        return mesService.obtenerConFiltros(mes, nommes);
    }

    @PostMapping
    public Mes agregar(@RequestBody Mes mes) {
        return mesService.agregar(mes);
    }

    @PutMapping("/{mes}")
    public Mes actualizar(
            @PathVariable int mes,
            @RequestBody Mes mesActualizado) {
        return mesService.actualizar(mes, mesActualizado);
    }

    @DeleteMapping("/{mes}")
    public String eliminar(@PathVariable int mes) {
        boolean eliminado = mesService.eliminar(mes);
        return eliminado ? "Mes eliminado" : "Mes no encontrado";
    }
}