package com.example.ProyectoSis414.repository;

import com.example.ProyectoSis414.entity.BajaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BajaRepository extends JpaRepository<BajaEntity, Integer> {
}