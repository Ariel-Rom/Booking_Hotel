package com.spring_boot_ariel_projects.hoteleria.model.cliente;

import jakarta.validation.constraints.NotBlank;

public record RegistroDeDatosCliente(@NotBlank String username,@NotBlank String email,
                                     @NotBlank String password, @NotBlank String role) {
}
