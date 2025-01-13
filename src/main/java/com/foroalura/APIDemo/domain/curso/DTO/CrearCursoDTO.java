package com.foroalura.APIDemo.domain.curso.DTO;

import com.foroalura.APIDemo.domain.curso.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CrearCursoDTO(
        @NotBlank String name,
        @NotNull Categoria categoria) {
}

