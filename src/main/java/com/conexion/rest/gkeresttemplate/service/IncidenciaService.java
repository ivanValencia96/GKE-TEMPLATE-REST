package com.conexion.rest.gkeresttemplate.service;

import com.conexion.rest.gkeresttemplate.entity.Incidencia;
import org.springframework.stereotype.Service;

@Service
public class IncidenciaService {

    public Incidencia getDetalleIncidenciaById(final Integer idIncidencia) {

        return new Incidencia(3123,
                "Particion de disco UBUNTU",
                3412,"En proceso",4239,"VALENCIAJV",
                3131,"Tecnica",
                414321, "ASUS VivoBook ASUSX218 Windows 11");
    }
}
