package com.foroalura.APIDemo.domain.topico.DTO;

import com.foroalura.APIDemo.domain.topico.Estado;

public record ActualizarTopicoDTO (
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
){
}

