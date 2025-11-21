package com.venturessoft.hucatmoneda.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "HU_CAT_MONEDA")
@IdClass(MonedaId.class)
public class Moneda {

    @Id
    @Column(name = "NUM_CIA", length = 4, nullable = false)
    private Integer numCia;

    @Id
    @Column(name = "CLAVE_MONEDA", length = 3, nullable = false)
    private String claveMoneda;

    @Column(name = "DESCRIPCION", length = 30, nullable = false)
    private String descripcion;

    @Column(name = "SIMBOLO", length = 5, nullable = false)
    private String simbolo;

    @Column(name = "ABREVIACION", length = 5, nullable = false)
    private String abreviacion;

    @Column(name = "MONEDA_CORRIENTE", length = 1, nullable = false)
    private String monedaCorriente;

    @Column(name = "STATUS", length = 1, nullable = false)
    private String status;
}
