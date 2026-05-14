package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.Mes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MesService {

    private List<Mes> meses = new ArrayList<>(List.of(
            new Mes(1, "Enero"),
            new Mes(2, "Febrero"),
            new Mes(3, "Marzo")
    ));

    public List<Mes> obtenerTodos() {
        return meses;
    }

    public List<Mes> obtenerConFiltros(Integer mes, String nommes) {
        return meses.stream()
                .filter(m -> mes == null || m.getMes() == mes)
                .filter(m -> nommes == null || m.getNommes().equalsIgnoreCase(nommes))
                .collect(Collectors.toList());
    }

    public Mes agregar(Mes mes) {
        meses.add(mes);
        return mes;
    }

    public Mes actualizar(int mesId, Mes mesActualizado) {
        for (int i = 0; i < meses.size(); i++) {
            if (meses.get(i).getMes() == mesId) {
                meses.set(i, mesActualizado);
                return mesActualizado;
            }
        }
        return null;
    }

    public boolean eliminar(int mesId) {
        return meses.removeIf(m -> m.getMes() == mesId);
    }
}