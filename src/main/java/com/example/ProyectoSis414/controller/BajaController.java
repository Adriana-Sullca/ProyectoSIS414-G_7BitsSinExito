package com.example.ProyectoSis414.controller;
import com.example.ProyectoSis414.model.Baja;
import com.example.ProyectoSis414.service.BajaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/bajas")
public class BajaController {


        private final BajaService bajaService;

        public BajaController(BajaService bajaService) {
            this.bajaService = bajaService;
        }

        @GetMapping
        public List<Baja> obtenerTodas() {
            return bajaService.obtenerTodas();
        }

        @GetMapping("/filtrar")
        public List<Baja> filtrar(
                @RequestParam(required = false) Integer codbaja,
                @RequestParam(required = false) String descbaja) {
            return bajaService.obtenerConFiltros(codbaja, descbaja);
        }

        @PostMapping
        public Baja agregar(@RequestBody Baja baja) {
            return bajaService.agregar(baja);
        }

        @PutMapping("/{codbajaId}")
        public Baja actualizar(
                @PathVariable int codbajaId,
                @RequestBody Baja bajaActualizada) {
            return bajaService.actualizar(codbajaId, bajaActualizada);
        }

        @DeleteMapping("/{codbajaId}")
        public String eliminar(@PathVariable int codbajaId) {
            boolean eliminado = bajaService.eliminar(codbajaId);
            return eliminado ? "Baja eliminada" : "Baja no encontrada";
        }
    }


