package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.CtaPar;
import com.example.ProyectoSis414.service.CtaParService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

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
    public ResponseEntity<?> agregar(@RequestBody CtaPar ctaPar) {
        try {
            ctaPar.setId(null);
            CtaPar nuevoCtaPar = ctaParService.agregar(ctaPar);

            return ResponseEntity.status(HttpStatus.CREATED).body(nuevoCtaPar);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error al registrar los datos: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody CtaPar ctaPar) {
        try {
            ctaPar.setId(id);

            return ctaParService.actualizar(id, ctaPar)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error al actualizar la cuenta: " + e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (ctaParService.eliminar(id)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}