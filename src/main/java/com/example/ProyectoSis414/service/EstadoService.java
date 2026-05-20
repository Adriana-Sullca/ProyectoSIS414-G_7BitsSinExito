package com.example.ProyectoSis414.service;

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

    public List<Estado> listarTodos() {
        return estadoRepository.findAll();
    }

    public Optional<Estado> buscarPorId(Long id) {
        return estadoRepository.findById(id);
    }

    public Estado guardar(Estado estado) {
        return estadoRepository.save(estado);
    }

    public void eliminar(Long id) {
        estadoRepository.deleteById(id);
    }

    public Optional<Estado> actualizar(Long id, Estado estadoActualizado) {
        return estadoRepository.findById(id).map(e -> {
            e.setNomestado(estadoActualizado.getNomestado());
            return estadoRepository.save(e);
        });
    }
}