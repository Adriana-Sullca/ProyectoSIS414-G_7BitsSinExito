package com.example.ProyectoSis414.repository;

import com.example.ProyectoSis414.entity.Transferencia;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TransferenciaRepository {

    private final List<Transferencia> transferencias = new ArrayList<>();

    public List<Transferencia> listar() {
        return transferencias;
    }

    public void guardar(Transferencia transferencia) {
        transferencias.add(transferencia);
    }
}