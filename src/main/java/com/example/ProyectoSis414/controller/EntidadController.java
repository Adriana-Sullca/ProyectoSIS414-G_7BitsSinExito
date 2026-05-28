package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.Entidad;
import com.example.ProyectoSis414.service.EntidadService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Entidad>> obtenerTodas() {
        List<Entidad> entidades = entidadService.obtenerTodas();
        if(entidades.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(entidades);
    }

    @PostMapping
    public ResponseEntity<Entidad> agregar(@RequestBody Entidad entidad) {
        Entidad nueva = entidadService.guardarNuevaEntidad(entidad);
        return ResponseEntity.status(201).body(nueva);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Entidad> actualizar(@PathVariable Long id, @RequestBody Entidad entidad) {
        try{
            Entidad actualizar = entidadService.actualizarEntidad(id, entidad);
            return ResponseEntity.ok(actualizar);
        }
        catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) {
        boolean eliminado = entidadService.eliminarEntidad(id);
        if(eliminado){
            return ResponseEntity.ok("Entidad eliminada exitosamnte");
        }
        return ResponseEntity.notFound().build();
    }
}
