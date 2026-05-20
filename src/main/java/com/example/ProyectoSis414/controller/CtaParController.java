package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.entity.CtaParEntity;
import com.example.ProyectoSis414.service.CtaParService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/ctapar")
public class CtaParController {

    private final CtaParService ctaParService;

    public CtaParController(CtaParService ctaParService) {
        this.ctaParService = ctaParService;
    }

    @GetMapping
    public List<CtaParEntity> obtenerTodos() {
        return ctaParService.obtenerTodos();
    }

    @GetMapping("/filtrar")
    public List<CtaParEntity> obtenerConFiltros(@RequestParam(required = false) String codigo) {
        return ctaParService.obtenerConFiltros(codigo);
    }

    @PostMapping
    public CtaParEntity agregar(@RequestBody CtaParEntity ctaPar) {
        return ctaParService.agregar(ctaPar);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CtaParEntity> actualizar(@PathVariable Long id, @RequestBody CtaParEntity ctaPar) {
        return ctaParService.actualizar(id, ctaPar)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (ctaParService.eliminar(id)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}