package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.Entidad;
import com.example.ProyectoSis414.repository.EntidadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadService {

    private final EntidadRepository entidadRepository;

    public EntidadService(EntidadRepository entidadRepository) {
        this.entidadRepository = entidadRepository;
    }

    public List<Entidad> obtenerTodas() {
        return entidadRepository.findAll();
    }

    public Entidad agregar(Entidad entidad) {
        return entidadRepository.save(entidad);
    }

    public Entidad actualizar(Long id, Entidad entidadActualizada) {
        entidadActualizada.setId(id);
        return entidadRepository.save(entidadActualizada);
    }

    public boolean eliminar(Long id) {
        if (entidadRepository.existsById(id)) {
            entidadRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
