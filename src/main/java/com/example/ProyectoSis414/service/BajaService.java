package com.example.ProyectoSis414.service;
import com.example.ProyectoSis414.model.Baja;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class BajaService {

        private final List<Baja> bajas = new ArrayList<>(List.of(
                new Baja(1, "Disposición definitiva de bienes"),
                new Baja(2, "Hurto, robo o pérdida fortuita"),
                new Baja(3, "Mermas")));


        public List<Baja> obtenerTodas() {
            return bajas;
        }

        public List<Baja> obtenerConFiltros(Integer codbaja, String descbaja) {
            return bajas.stream()
                    .filter(b -> codbaja == null || b.getCodbaja() == codbaja)
                    .filter(b -> descbaja == null || b.getDescbaja().equalsIgnoreCase(descbaja))
                    .collect(Collectors.toList());
        }

        public Baja agregar(Baja baja) {
            bajas.add(baja);
            return baja;
        }

        public Baja actualizar(int codbajaId, Baja bajaActualizada) {
            for (int i = 0; i < bajas.size(); i++) {
                if (bajas.get(i).getCodbaja() == codbajaId) {
                    bajas.set(i, bajaActualizada);
                    return bajaActualizada;
                }
            }
            return null;
        }

        public boolean eliminar(int codbaja) {
            return bajas.removeIf(b -> b.getCodbaja() == codbaja);
        }
    }


