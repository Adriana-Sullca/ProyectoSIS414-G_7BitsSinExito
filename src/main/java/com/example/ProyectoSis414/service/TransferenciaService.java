package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.entity.Transferencia;
import com.example.ProyectoSis414.repository.TransferenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferenciaService {

    private final TransferenciaRepository repository;

    public TransferenciaService(TransferenciaRepository repository) {
        this.repository = repository;
    }

    public List<Transferencia> obtenerTransferencias() {
        return repository.listar();
    }

    public void guardarTransferencia(Transferencia transferencia) {
        repository.guardar(transferencia);
    }
}