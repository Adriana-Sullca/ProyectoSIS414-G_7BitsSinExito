package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.entity.Transferencia;
import com.example.ProyectoSis414.service.TransferenciaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

    private final TransferenciaService service;

    public TransferenciaController(TransferenciaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Transferencia> listarTransferencias() {
        return service.obtenerTransferencias();
    }

    @PostMapping
    public String guardarTransferencia(@RequestBody Transferencia transferencia) {
        service.guardarTransferencia(transferencia);
        return "Transferencia guardada correctamente";
    }
}