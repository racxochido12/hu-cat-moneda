package com.venturessoft.hucatmoneda.service.impl;

import com.venturessoft.hucatmoneda.model.Moneda;
import com.venturessoft.hucatmoneda.model.MonedaId;
import com.venturessoft.hucatmoneda.repository.MonedaRepository;
import com.venturessoft.hucatmoneda.service.MonedaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonedaServiceImpl implements MonedaService {

    private final MonedaRepository monedaRepository;

    public MonedaServiceImpl(MonedaRepository monedaRepository) {
        this.monedaRepository = monedaRepository;
    }

    @Override
    public Moneda guardar(Moneda moneda) {
        return monedaRepository.save(moneda);
    }

    @Override
    public Moneda buscar(Integer numCia, String claveMoneda) {
        MonedaId id = new MonedaId(numCia, claveMoneda);

        return monedaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("La moneda no existe"));
    }

    @Override
    public List<Moneda> listar() {
        return monedaRepository.findAll();
    }

    @Override
    public Moneda actualizar(Moneda moneda) {
        MonedaId id = new MonedaId(
                moneda.getNumCia(),
                moneda.getClaveMoneda()
        );

        if (!monedaRepository.existsById(id)) {
            throw new RuntimeException("No se puede actualizar: la moneda no existe");
        }

        return monedaRepository.save(moneda);
    }

    @Override
    public void eliminar(Integer numCia, String claveMoneda) {
        MonedaId id = new MonedaId(numCia, claveMoneda);

        if (!monedaRepository.existsById(id)) {
            throw new RuntimeException("No se puede eliminar: la moneda no existe");
        }

        monedaRepository.deleteById(id);
    }
}
