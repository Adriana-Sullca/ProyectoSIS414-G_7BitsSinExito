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
    public Entidad guardarNuevaEntidad(Entidad entidad) {
        return entidadRepository.save(entidad);
    }

    public Entidad actualizarEntidad(Long id, Entidad entidad) {
        if(!entidadRepository.existsById(id)){
            throw new RuntimeException("Entidad no encontrada con id: "+ id);
        }
        entidad.setId(id);
        return entidadRepository.save(entidad);
    }

    public boolean eliminarEntidad(Long id) {
        if (!entidadRepository.existsById(id)) {
            return false;
        }
        entidadRepository.deleteById(id);
        return true;
    }
}
