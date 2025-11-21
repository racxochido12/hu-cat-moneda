package com.venturessoft.hucatmoneda.model;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MonedaId implements Serializable {
    private Integer numCia;
    private String claveMoneda;

    public MonedaId(Integer numCia, String claveMoneda) {
        this.numCia = numCia;
        this.claveMoneda = claveMoneda;
    }
}
