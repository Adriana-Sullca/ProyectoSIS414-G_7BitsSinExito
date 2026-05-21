package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.entity.BajaEntity;
import com.example.ProyectoSis414.repository.BajaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BajaService {

    private final BajaRepository bajaRepository;

    public BajaService(BajaRepository bajaRepository) {
        this.bajaRepository = bajaRepository;
    }

    public List<BajaEntity> obtenerTodas() {
        return bajaRepository.findAll();
    }

    public List<BajaEntity> obtenerConFiltros(Integer codbaja, String descbaja) {
        return bajaRepository.findAll().stream()
                .filter(b -> codbaja == null || b.getCodbaja() == codbaja)
                .filter(b -> descbaja == null || b.getDescbaja().toLowerCase().contains(descbaja.toLowerCase()))
                .collect(Collectors.toList());
    }

    public BajaEntity agregar(BajaEntity nuevaBaja) {
        return bajaRepository.save(nuevaBaja);
    }

    public BajaEntity actualizar(int codbaja, BajaEntity bajaActualizada) {
        Optional<BajaEntity> bajaExistente = bajaRepository.findById(codbaja);

        if (bajaExistente.isPresent()) {
            BajaEntity baja = bajaExistente.get();
            baja.setDescbaja(bajaActualizada.getDescbaja());
            return bajaRepository.save(baja);
        }
        return null;
    }

    public boolean eliminar(int codbaja) {
        if (bajaRepository.existsById(codbaja)) {
            bajaRepository.deleteById(codbaja);
            return true;
        }
        return false;
    }
}