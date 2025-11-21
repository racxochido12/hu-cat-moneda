package com.venturessoft.hucatmoneda.service;

import com.venturessoft.hucatmoneda.model.Moneda;

import java.util.List;

public interface MonedaService {

    Moneda guardar(Moneda moneda);

    Moneda buscar(Integer numCia, String claveMoneda);

    List<Moneda> listar();

    Moneda actualizar(Moneda moneda);

    void eliminar(Integer numCia, String claveMoneda);
}
