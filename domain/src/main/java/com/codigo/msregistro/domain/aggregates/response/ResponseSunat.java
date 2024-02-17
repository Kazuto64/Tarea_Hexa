package com.codigo.msregistro.domain.aggregates.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseSunat {
    private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private String estado;
    private String direccion;
    private String distrito;
    private String provincia;
    private String departamento;
}
