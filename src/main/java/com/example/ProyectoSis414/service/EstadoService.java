package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.entity.EstadoEntity;
import com.example.ProyectoSis414.model.Estado;
import com.example.ProyectoSis414.repository.EstadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    private final EstadoRepository estadoRepository;

    public EstadoService(EstadoRepository estadoRepository) {

        this.estadoRepository = estadoRepository;
    }

    public List<EstadoEntity> listarTodos() {
        return estadoRepository.findAll();
    }

    public Optional<EstadoEntity> buscarPorId(Long id) {
        return estadoRepository.findById(id);
    }

    public EstadoEntity guardar(EstadoEntity estado) {
        return estadoRepository.save(estado);
    }

    public void eliminar(Long id) {

        estadoRepository.deleteById(id);
    }

    public Optional<EstadoEntity> actualizar(Long id, EstadoEntity estadoActualizado) {
        return estadoRepository.findById(id).map(e -> {
            e.setNomestado(estadoActualizado.getNomestado());
            return estadoRepository.save(e);
        });
    }
}
