package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.Baja;
import com.example.ProyectoSis414.repository.BajaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BajaService {

    private final BajaRepository bajaRepository;

    public BajaService(BajaRepository bajaRepository) {
        this.bajaRepository = bajaRepository;
    }

    public List<Baja> obtenerTodos() {
        return bajaRepository.findAll();
    }

    public Baja agregar(Baja baja) {
        return bajaRepository.save(baja);
    }

    public Baja actualizar(Long id, Baja bajaActualizada) {
        bajaActualizada.setCodbaja(id);
        return bajaRepository.save(bajaActualizada);
    }

    public boolean eliminar(Long id) {
        if (bajaRepository.existsById(id)) {
            bajaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}