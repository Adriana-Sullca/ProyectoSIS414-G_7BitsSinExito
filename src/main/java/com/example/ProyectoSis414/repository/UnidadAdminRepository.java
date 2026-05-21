package com.example.ProyectoSis414.repository;

import com.example.ProyectoSis414.entity.UnidadAdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadAdminRepository extends JpaRepository<UnidadAdminEntity, Long> {
}

