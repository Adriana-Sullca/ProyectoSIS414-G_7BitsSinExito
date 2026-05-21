package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.CtaPar;
import com.example.ProyectoSis414.service.CtaParService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ctapar")
@CrossOrigin ( origins = "*")
public class CtaParController {

    private final CtaParService ctaParService;

    public CtaParController(CtaParService ctaParService) {
        this.ctaParService = ctaParService;
    }

    @GetMapping
    public List<CtaPar> obtenerTodos() {
        return ctaParService.obtenerTodos();
    }

    @GetMapping("/filtrar")
    public List<CtaPar> obtenerConFiltros(@RequestParam(required = false) String codigo) {
        return ctaParService.obtenerConFiltros(codigo);
    }

    @PostMapping
    public CtaPar agregar(@RequestBody CtaPar ctaPar) {
        return ctaParService.agregar(ctaPar);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CtaPar> actualizar(@PathVariable Long id, @RequestBody CtaPar ctaPar) {
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