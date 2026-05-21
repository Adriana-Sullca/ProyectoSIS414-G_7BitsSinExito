package com.example.ProyectoSis414.repository;

import com.example.ProyectoSis414.model.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadRepository extends JpaRepository<Entidad, Long> {
}