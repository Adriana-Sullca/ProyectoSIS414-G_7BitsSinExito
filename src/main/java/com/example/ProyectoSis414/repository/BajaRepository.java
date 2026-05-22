package com.example.ProyectoSis414.repository;

import com.example.ProyectoSis414.model.Baja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BajaRepository extends JpaRepository<Baja, Integer> {

}
