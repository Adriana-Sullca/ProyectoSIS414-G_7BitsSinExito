package mes.mes.service;

import mes.mes.dto.MesDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MesService {

    private List<MesDTO> lista = new ArrayList<>();
    private AtomicLong id = new AtomicLong(1);

    public List<MesDTO> getAll() {
        return lista;
    }

    public MesDTO getById(Long idBuscado) {

        return lista.stream()
                .filter(m -> m.getId().equals(idBuscado))
                .findFirst()
                .orElse(null);
    }

    public MesDTO add(MesDTO mes) {

        mes.setId(id.getAndIncrement());
        lista.add(mes);

        return mes;
    }

    public MesDTO update(Long idBuscado, MesDTO nuevo) {

        MesDTO mes = getById(idBuscado);

        if (mes != null) {
            mes.setNombre(nuevo.getNombre());
        }

        return mes;
    }

    public void delete(Long idBuscado) {
        lista.removeIf(m -> m.getId().equals(idBuscado));
    }
}