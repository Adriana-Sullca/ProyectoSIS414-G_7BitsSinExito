package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.ObjGasto;
import com.example.ProyectoSis414.service.ObjGastoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objgastos")
public class ObjGastoController {

    private final ObjGastoService objGastoService;

    public ObjGastoController(ObjGastoService objGastoService) {
        this.objGastoService = objGastoService;
    }

    @GetMapping
    public List<ObjGasto> obtenerTodos() {
        return objGastoService.obtenerTodos();
    }

    @GetMapping("/filtrar")
    public List<ObjGasto> filtrar(
            @RequestParam(required = false) Integer gestion,
            @RequestParam(required = false) Integer partida) {
        return objGastoService.obtenerConFiltros(gestion, partida);
    }

    @PostMapping
    public ObjGasto agregar(@RequestBody ObjGasto objGasto) {
        return objGastoService.agregar(objGasto);
    }

    @PutMapping("/{gestion}/{partida}")
    public ObjGasto actualizar(
            @PathVariable int gestion,
            @PathVariable int partida,
            @RequestBody ObjGasto objGastoActualizado) {
        return objGastoService.actualizar(gestion, partida, objGastoActualizado);
    }

    @DeleteMapping("/{gestion}/{partida}")
    public String eliminar(@PathVariable int gestion, @PathVariable int partida) {
        boolean eliminado = objGastoService.eliminar(gestion, partida);
        return eliminado ? "ObjGasto eliminado" : "ObjGasto no encontrado";
    }
}