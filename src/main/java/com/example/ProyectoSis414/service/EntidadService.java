package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.Entidad;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntidadService {

    private List<Entidad> entidades = new ArrayList<>(List.of(
            new Entidad(2015, 6,  "Vicepresidencia del Estado Plurinacional", "VPEP"),
            new Entidad(2015, 10, "Ministerio de Relaciones Exteriores", "MIN-RREE")
    ));

    public List<Entidad> obtenerTodas() {
        return entidades;
    }

    public List<Entidad> obtenerConFiltros(Integer gestion, String siglaEnt) {
        return entidades.stream()
                .filter(e -> gestion == null || e.getGestion() == gestion)
                .filter(e -> siglaEnt == null || e.getSiglaEnt().equalsIgnoreCase(siglaEnt))
                .collect(Collectors.toList());
    }

    public Entidad agregar(Entidad entidad) {
        entidades.add(entidad);
        return entidad;
    }

    public Entidad actualizar(int gestion, int entidadId, Entidad entidadActualizada) {
        for (int i = 0; i < entidades.size(); i++) {
            if (entidades.get(i).getGestion() == gestion && entidades.get(i).getEntidad() == entidadId) {
                entidades.set(i, entidadActualizada);
                return entidadActualizada;
            }
        }
        return null;
    }

    public boolean eliminar(int gestion, int entidadId) {
        return entidades.removeIf(e -> e.getGestion() == gestion && e.getEntidad() == entidadId);
    }
}
