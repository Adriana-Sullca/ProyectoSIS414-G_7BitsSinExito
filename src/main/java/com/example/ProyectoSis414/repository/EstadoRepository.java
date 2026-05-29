package com.example.ProyectoSis414.repository;

import com.example.ProyectoSis414.model.Estado;
import java.util.List;
import java.util.Optional;

public interface EstadoRepository {
    List<Estado> findAll();
    Optional<Estado> findById(Long id);
    Estado save(Estado estado);
    void deleteById(Long id);
}