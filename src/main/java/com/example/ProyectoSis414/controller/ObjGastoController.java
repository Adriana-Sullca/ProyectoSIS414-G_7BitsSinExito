package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.ObjGasto;
import com.example.ProyectoSis414.service.ObjGastoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objgastos")
@CrossOrigin(origins = "*")
public class ObjGastoController {

    private final ObjGastoService objGastoService;

    public ObjGastoController(ObjGastoService objGastoService) {
        this.objGastoService = objGastoService;
    }

    @GetMapping
    public List<ObjGasto> obtenerTodos() {
        return objGastoService.obtenerTodos();
    }

    @PostMapping
    public ObjGasto agregar(@RequestBody ObjGasto objGasto) {
        return objGastoService.agregar(objGasto);
    }

    @PutMapping("/{id}")
    public ObjGasto actualizar(@PathVariable Long id, @RequestBody ObjGasto objGasto) {
        return objGastoService.actualizar(id, objGasto);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        boolean eliminado = objGastoService.eliminar(id);
        return eliminado ? "ObjGasto eliminado" : "ObjGasto no encontrado";
    }
}