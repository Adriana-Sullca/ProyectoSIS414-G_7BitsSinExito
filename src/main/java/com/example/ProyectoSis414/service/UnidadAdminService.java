package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.UnidadAdmin;
import com.example.ProyectoSis414.repository.UnidadAdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadAdminService {

    private final UnidadAdminRepository unidadAdminRepository;

    public UnidadAdminService(UnidadAdminRepository unidadAdminRepository) {
        this.unidadAdminRepository = unidadAdminRepository;
    }

    public List<UnidadAdmin> obtenerTodos() {
        return unidadAdminRepository.findAll();
    }

    public UnidadAdmin agregar(UnidadAdmin unidadAdmin) {
        return unidadAdminRepository.save(unidadAdmin);
    }

    public UnidadAdmin actualizar(Long id, UnidadAdmin unidadAdmin) {
        UnidadAdmin existente = unidadAdminRepository.findById(id).orElse(null);

        if (existente != null) {
            existente.setEntidad(unidadAdmin.getEntidad());
            existente.setUnidad(unidadAdmin.getUnidad());
            existente.setDescripcion(unidadAdmin.getDescripcion());
            existente.setCiudad(unidadAdmin.getCiudad());

            return unidadAdminRepository.save(existente);
        }

        return null;
    }

    public void eliminar(Long id) {
        unidadAdminRepository.deleteById(id);
    }
}