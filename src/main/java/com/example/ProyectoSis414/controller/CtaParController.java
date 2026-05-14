package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.CtaPar;
import com.example.ProyectoSis414.service.CtaParService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ctapar")
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
    public List<CtaPar> filtrar(
            @RequestParam(required = false) Integer codcont,
            @RequestParam(required = false) Integer gestion) {
        return ctaParService.obtenerConFiltros(codcont, gestion);
    }

    @PostMapping
    public CtaPar agregar(@RequestBody CtaPar ctaPar) {
        return ctaParService.agregar(ctaPar);
    }

    @PutMapping("/{codcont}/{partida}")
    public CtaPar actualizar(
            @PathVariable int codcont,
            @PathVariable int partida,
            @RequestBody CtaPar ctaParActualizado) {
        return ctaParService.actualizar(codcont, partida, ctaParActualizado);
    }

    @DeleteMapping("/{codcont}/{partida}")
    public String eliminar(@PathVariable int codcont, @PathVariable int partida) {
        boolean eliminado = ctaParService.eliminar(codcont, partida);
        return eliminado ? "CtaPar eliminado" : "CtaPar no encontrado";
    }
}