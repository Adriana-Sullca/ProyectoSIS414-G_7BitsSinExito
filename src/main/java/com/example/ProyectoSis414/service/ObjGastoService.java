package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.ObjGasto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ObjGastoService {

    private List<ObjGasto> objGastos = new ArrayList<>(List.of(
            new ObjGasto(0, 41100, "Edificios"),
            new ObjGasto(0, 41200, "Tierras y Terrenos")
    ));

    public List<ObjGasto> obtenerTodos() {
        return objGastos;
    }

    public List<ObjGasto> obtenerConFiltros(Integer gestion, Integer partida) {
        return objGastos.stream()
                .filter(o -> gestion == null || o.getGestion() == gestion)
                .filter(o -> partida == null || o.getPartida() == partida)
                .collect(Collectors.toList());
    }

    public ObjGasto agregar(ObjGasto objGasto) {
        objGastos.add(objGasto);
        return objGasto;
    }

    public ObjGasto actualizar(int gestion, int partida, ObjGasto objGastoActualizado) {
        for (int i = 0; i < objGastos.size(); i++) {
            if (objGastos.get(i).getGestion() == gestion && objGastos.get(i).getPartida() == partida) {
                objGastos.set(i, objGastoActualizado);
                return objGastoActualizado;
            }
        }
        return null;
    }

    public boolean eliminar(int gestion, int partida) {
        return objGastos.removeIf(o -> o.getGestion() == gestion && o.getPartida() == partida);
    }
}
