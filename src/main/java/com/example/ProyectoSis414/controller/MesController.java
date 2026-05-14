package com.example.ProyectoSis414.controller;

import com.example.ProyectoSis414.model.MesDTO;
import com.example.ProyectoSis414.service.MesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mes")
public class MesController {

    private final MesService service;

    public MesController(MesService service) {
        this.service = service;
    }

    @GetMapping
    public List<MesDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public MesDTO getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public MesDTO add(@RequestBody MesDTO mes) {
        return service.add(mes);
    }

    @PutMapping("/{id}")
    public MesDTO update(@PathVariable Long id, @RequestBody MesDTO mes) {
        return service.update(id, mes);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}