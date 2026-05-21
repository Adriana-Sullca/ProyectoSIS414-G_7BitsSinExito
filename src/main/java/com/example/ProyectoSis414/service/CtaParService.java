package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.CtaPar;
import com.example.ProyectoSis414.repository.CtaParRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CtaParService {

    private final CtaParRepository ctaParRepository;

    public CtaParService(CtaParRepository ctaParRepository) {
        this.ctaParRepository = ctaParRepository;
    }

    public List<CtaPar> obtenerTodos() {
        return ctaParRepository.findAll();
    }

    public List<CtaPar> obtenerConFiltros(String codigo) {
        List<CtaPar> todas = ctaParRepository.findAll();
        return todas.stream()
                .filter(c -> codigo == null || c.getCodigo().equalsIgnoreCase(codigo))
                .collect(Collectors.toList());
    }

    public CtaPar agregar(CtaPar ctaPar) {
        return ctaParRepository.save(ctaPar);
    }

    public Optional<CtaPar> actualizar(Long id, CtaPar ctaParActualizado) {
        return ctaParRepository.findById(id).map(existente -> {
            existente.setCodigo(ctaParActualizado.getCodigo());
            existente.setDescripcion(ctaParActualizado.getDescripcion());
            existente.setMonto(ctaParActualizado.getMonto());
            existente.setCodestado(ctaParActualizado.getCodestado());
            existente.setMes(ctaParActualizado.getMes());
            return ctaParRepository.save(existente);
        });
    }

    public boolean eliminar(Long id) {
        if (ctaParRepository.existsById(id)) {
            ctaParRepository.deleteById(id);
            return true;
        }
        return false;
    }
}