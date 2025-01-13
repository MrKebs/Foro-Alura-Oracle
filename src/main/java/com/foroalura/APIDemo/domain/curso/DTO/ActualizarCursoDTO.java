package com.foroalura.APIDemo.domain.curso.DTO;

import com.foroalura.APIDemo.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}
