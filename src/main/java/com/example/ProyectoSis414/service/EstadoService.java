package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.Estado;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {
    private final List<Estado> estados = new ArrayList<>();
    private Long contador = 1L;

    public List<Estado> listarTodos() { return estados; }

    public Optional<Estado> buscarPorId(Long id) {
        return estados.stream().filter(e -> e.getCodestado().equals(id)).findFirst();
    }

    public Estado guardar(Estado estado) {
        estado.setCodestado(contador++);
        estados.add(estado);
        return estado;
    }

    public void eliminar(Long id) {
        estados.removeIf(e -> e.getCodestado().equals(id));
    }
}