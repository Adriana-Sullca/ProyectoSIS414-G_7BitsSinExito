package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.CtaPar;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CtaParService {

    private List<CtaPar> ctaPars = new ArrayList<>(List.of(
            new CtaPar(1, 41100, 0),
            new CtaPar(2, 43100, 0),
            new CtaPar(3, 43200, 0)
    ));

    public List<CtaPar> obtenerTodos() {
        return ctaPars;
    }

    public List<CtaPar> obtenerConFiltros(Integer codcont, Integer gestion) {
        return ctaPars.stream()
                .filter(c -> codcont == null || c.getCodcont() == codcont)
                .filter(c -> gestion == null || c.getGestion() == gestion)
                .collect(Collectors.toList());
    }

    public CtaPar agregar(CtaPar ctaPar) {
        ctaPars.add(ctaPar);
        return ctaPar;
    }

    public CtaPar actualizar(int codcont, int partida, CtaPar ctaParActualizado) {
        for (int i = 0; i < ctaPars.size(); i++) {
            if (ctaPars.get(i).getCodcont() == codcont && ctaPars.get(i).getPartida() == partida) {
                ctaPars.set(i, ctaParActualizado);
                return ctaParActualizado;
            }
        }
        return null;
    }

    public boolean eliminar(int codcont, int partida) {
        return ctaPars.removeIf(c -> c.getCodcont() == codcont && c.getPartida() == partida);
    }
}