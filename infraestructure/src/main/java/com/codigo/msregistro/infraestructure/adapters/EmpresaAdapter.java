package com.codigo.msregistro.infraestructure.adapters;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.domain.aggregates.request.RequestEmpresa;
import com.codigo.msregistro.domain.aggregates.response.ResponseSunat;
import com.codigo.msregistro.domain.ports.out.EmpresaServiceOut;
import com.codigo.msregistro.infraestructure.mapper.EmpresaMapper;
import com.codigo.msregistro.infraestructure.redis.RedisService;
import com.codigo.msregistro.infraestructure.repository.EmpresaRepository;
import com.codigo.msregistro.infraestructure.repository.TipoDocumentoRepository;
import com.codigo.msregistro.infraestructure.rest.client.ClienteSunat;
import com.codigo.msregistro.infraestructure.util.Util;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpresaAdapter implements EmpresaServiceOut {
    private final EmpresaRepository empresaRepository;
    private final TipoDocumentoRepository tipoDocumentoRepository;
    private final EmpresaMapper empresaMapper;
    private final ClienteSunat sunat;
    private final RedisService redisService;
    private final Util util;

    @Value(staticConstructor = "${token.api}")
    private String tokenApi;

    @Override
    public EmpresaDTO crearEmpresaOut(RequestEmpresa requestEmpresa) {
        ResponseSunat datosSunat = getExecutionSunat(requestEmpresa.getNumDoc());
    }

    private ResponseSunat getExecutionSunat(String numDoc) {
    }

    @Override
    public Optional<EmpresaDTO> obtenerEmpresaOut(Long id) {
        return Optional.empty();
    }

    @Override
    public List<EmpresaDTO> obtenerTodosOut() {
        return null;
    }

    @Override
    public EmpresaDTO actualizarOut(Long id, RequestEmpresa requestEmpresa) {
        return null;
    }

    @Override
    public EmpresaDTO deleteOut(Long id) {
        return null;
    }
}
