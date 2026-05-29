package com.example.ProyectoSis414.service;

import com.example.ProyectoSis414.model.ObjGasto;
import com.example.ProyectoSis414.repository.ObjGastoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjGastoService {

    private final ObjGastoRepository objGastoRepository;

    public ObjGastoService(ObjGastoRepository objGastoRepository) {
        this.objGastoRepository = objGastoRepository;
    }

    public List<ObjGasto> obtenerTodos() {
        return objGastoRepository.findAll();
    }

    public ObjGasto agregar(ObjGasto objGasto) {
        return objGastoRepository.save(objGasto);
    }

    public ObjGasto actualizar(Long id, ObjGasto objGastoActualizado) {
        objGastoActualizado.setId(id);
        return objGastoRepository.save(objGastoActualizado);
    }

    public boolean eliminar(Long id) {
        if (objGastoRepository.existsById(id)) {
            objGastoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
