package com.example.ProyectoSis414.repository;

import com.example.ProyectoSis414.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface    EstadoRepository extends JpaRepository<Estado, Long> {}
