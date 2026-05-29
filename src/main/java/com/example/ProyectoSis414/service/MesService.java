package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.Mes;
import com.example.ProyectoSis414.repository.MesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesService {

    private final MesRepository mesRepository;

    public MesService(MesRepository mesRepository) {
        this.mesRepository = mesRepository;
    }

    public List<Mes> obtenerTodos() {
        return mesRepository.findAll();
    }

    public Mes agregar(Mes mes) {
        return mesRepository.save(mes);
    }

    public Mes actualizar(Long id, Mes mesActualizado) {
        mesActualizado.setId(id);
        return mesRepository.save(mesActualizado);
    }

    public boolean eliminar(Long id) {
        if (mesRepository.existsById(id)) {
            mesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}