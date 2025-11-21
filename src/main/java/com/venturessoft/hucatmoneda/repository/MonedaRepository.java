package com.venturessoft.hucatmoneda.repository;

import com.venturessoft.hucatmoneda.model.Moneda;
import com.venturessoft.hucatmoneda.model.MonedaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonedaRepository extends JpaRepository<Moneda, MonedaId> {
}
