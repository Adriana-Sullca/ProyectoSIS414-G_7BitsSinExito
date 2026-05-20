package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.entity.EstadoEntity;
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
    @GetMapping
    public List<EstadoEntity> listarTodos(){
        return service.listarTodos();
    }
    @GetMapping("/{id}")
    public Optional<EstadoEntity> buscarPorId(@PathVariable Long id) {

        return service.buscarPorId(id);
    }
    @PostMapping
    public EstadoEntity guardar(@RequestBody EstadoEntity estado) {

        return service.guardar(estado);
    }
    @PutMapping("/{id}")
    public Optional<EstadoEntity> actualizar(@PathVariable Long id, @RequestBody EstadoEntity estado) {
        return service.actualizar(id, estado);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {

        service.eliminar(id);
    }

}