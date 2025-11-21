package com.venturessoft.hucatmoneda.controller;

import com.venturessoft.hucatmoneda.model.Moneda;
import com.venturessoft.hucatmoneda.service.MonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monedas")
public class MonedaController {

    @Autowired
    private MonedaService monedaService;

    // ⭐ LISTAR TODAS
    @GetMapping
    public List<Moneda> listar() {
        return monedaService.listar();
    }

    // ⭐ BUSCAR POR ID COMPUESTO
    @GetMapping("/{numCia}/{claveMoneda}")
    public Moneda buscar(
            @PathVariable Integer numCia,
            @PathVariable String claveMoneda
    ) {
        return monedaService.buscar(numCia, claveMoneda);
    }

    // ⭐ GUARDAR (INSERT)
    @PostMapping
    public Moneda guardar(@RequestBody Moneda moneda) {
        return monedaService.guardar(moneda);
    }

    // ⭐ ACTUALIZAR
    @PutMapping
    public Moneda actualizar(@RequestBody Moneda moneda) {
        return monedaService.actualizar(moneda);
    }

    // ⭐ ELIMINAR
    @DeleteMapping("/{numCia}/{claveMoneda}")
    public String eliminar(
            @PathVariable Integer numCia,
            @PathVariable String claveMoneda
    ) {
        monedaService.eliminar(numCia, claveMoneda);
        return "Registro eliminado correctamente";
    }
}
