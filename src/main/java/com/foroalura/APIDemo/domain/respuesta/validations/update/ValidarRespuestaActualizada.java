package com.foroalura.APIDemo.domain.respuesta.validations.update;

import com.foroalura.APIDemo.domain.respuesta.DTO.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {
    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
