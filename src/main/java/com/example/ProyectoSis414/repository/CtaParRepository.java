package com.example.ProyectoSis414.repository;

import com.example.ProyectoSis414.model.CtaPar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtaParRepository extends JpaRepository<CtaPar, Long> {
}