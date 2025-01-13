package com.foroalura.APIDemo.domain.respuesta.DTO;

public record ActualizarRespuestaDTO(
        String mensaje,
        Boolean solucion,
        Boolean borrado
) {
}
