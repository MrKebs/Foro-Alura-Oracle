package com.foroalura.APIDemo.domain.usuario.DTO;

import com.foroalura.APIDemo.domain.usuario.Role;

public record ActualizarUsuarioDTO(
        String password,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
}

