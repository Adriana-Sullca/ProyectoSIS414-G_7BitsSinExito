package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.Estado;
import com.example.ProyectoSis414.repository.EstadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {
    private final EstadoRepository repository;

    public EstadoService(EstadoRepository repository) {
        this.repository = repository;
    }

    public List<Estado> listar() {
        return repository.findAll();
    }

    public Optional<Estado> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Optional<Estado> actualizar(Long id, Estado estado) {
        return repository.findById(id).map(e -> {
            e.setNomestado(estado.getNomestado());
            return repository.save(e);
        });
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}