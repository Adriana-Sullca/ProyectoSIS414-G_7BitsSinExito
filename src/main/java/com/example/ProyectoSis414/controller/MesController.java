package mes.mes.controller;

import mes.mes.dto.MesDTO;
import mes.mes.service.MesService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meses")
public class MesController {

    private final MesService service;

    public MesController(MesService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "Obtener todos los meses")
    public List<MesDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener mes por id")
    public MesDTO getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    @Operation(summary = "Crear nuevo mes")
    public MesDTO add(@RequestBody MesDTO mes) {
        return service.add(mes);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar un mes")
    public MesDTO update(@PathVariable Long id,
                         @RequestBody MesDTO mes) {

        return service.update(id, mes);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un mes")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}