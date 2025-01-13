package com.foroalura.APIDemo.domain.curso.DTO;

import com.foroalura.APIDemo.domain.curso.Categoria;
import com.foroalura.APIDemo.domain.curso.Curso;

public record DetalleCursoDTO(
        Long id,
        String name,
        Categoria categoria,
        Boolean activo) {

    public DetalleCursoDTO(Curso curso){
        this(
                curso.getId(),
                curso.getName(),
                curso.getCategoria(),
                curso.getActivo());
    }

}
