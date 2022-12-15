package com.conexion.rest.gkeresttemplate.controller;

import com.conexion.rest.gkeresttemplate.entity.Incidencia;
import com.conexion.rest.gkeresttemplate.service.IncidenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/incidencia")
public class IncidenciaController {

    @Autowired
    IncidenciaService incidenciaService;

    @GetMapping("/{idIncidencia}/resumen")
    public Incidencia getDetalleIncidenciaById(@PathVariable(name = "idIncidencia")
                                               final Integer idIncidencia) {

        return incidenciaService.getDetalleIncidenciaById(idIncidencia);
    }
}
