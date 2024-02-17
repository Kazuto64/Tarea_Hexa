package com.codigo.msregistro.domain.impl;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.domain.aggregates.request.RequestEmpresa;
import com.codigo.msregistro.domain.ports.in.EmpresaServiceIn;
import com.codigo.msregistro.domain.ports.out.EmpresaServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpresaServiceImpl implements EmpresaServiceIn {
    private final EmpresaServiceOut empresaServiceOut;

    @Override
    public EmpresaDTO crearEmpresaIn(RequestEmpresa requestEmpresa) {
        return empresaServiceOut.crearEmpresaOut(requestEmpresa);
    }
}
