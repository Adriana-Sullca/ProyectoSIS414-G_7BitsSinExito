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
}