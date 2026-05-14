package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.UnidadAdmin;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnidadAdminService {

    private final List<UnidadAdmin> unidades = new ArrayList<>();

    public List<UnidadAdmin> listar() {
        return unidades;
    }

    public UnidadAdmin guardar(UnidadAdmin unidadAdmin) {
        unidades.add(unidadAdmin);
        return unidadAdmin;
    }

    public UnidadAdmin actualizar(Long id, UnidadAdmin nuevaUnidad) {
        for (UnidadAdmin unidad : unidades) {
            if (unidad.getId().equals(id)) {
                unidad.setEntidad(nuevaUnidad.getEntidad());
                unidad.setUnidad(nuevaUnidad.getUnidad());
                unidad.setDescripcion(nuevaUnidad.getDescripcion());
                unidad.setCiudad(nuevaUnidad.getCiudad());
                return unidad;
            }
        }
        return null;
    }

    public boolean eliminar(Long id) {
        return unidades.removeIf(unidad -> unidad.getId().equals(id));
    }

    public List<UnidadAdmin> filtrarPorCiudad(String ciudad) {
        return unidades.stream()
                .filter(unidad -> unidad.getCiudad().equalsIgnoreCase(ciudad))
                .toList();
    }
}