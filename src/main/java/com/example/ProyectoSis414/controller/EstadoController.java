package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.Estado;
import com.example.ProyectoSis414.service.EstadoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estado")
@CrossOrigin("*")
public class EstadoController {
    private final EstadoService service;
    public EstadoController(EstadoService service) {
        this.service = service;
    }
    @PutMapping("/{id}")
    public Optional<Estado> actualizar(@PathVariable Long id, @RequestBody Estado estado) {
        return service.actualizar(id, estado);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
    @GetMapping
    public List<Estado> listarTodos() {
        return service.listarTodos();
    }
    @PostMapping
    public Estado guardar(@RequestBody Estado estado) {
        return service.guardar(estado);
    }
    @GetMapping("/{id}")
    public Optional<Estado> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

}