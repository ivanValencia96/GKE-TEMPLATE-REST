package com.conexion.rest.gkeresttemplate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Incidencia {

    private Integer idIncidencia;
    private String descripcion;
    private Integer idEstatus;
    private String estatus;
    private Integer idUsuarioResolutor;
    private String usuarioResolutor;
    private Integer idTpoIncidencia;
    private String tipoIncidencia;
    private Integer idEquipo;
    private String equipo;
}
