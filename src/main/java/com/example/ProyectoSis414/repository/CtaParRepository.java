package com.example.ProyectoSis414.repository;

import com.example.ProyectoSis414.entity.CtaParEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtaParRepository extends JpaRepository<CtaParEntity, Long> {
}
