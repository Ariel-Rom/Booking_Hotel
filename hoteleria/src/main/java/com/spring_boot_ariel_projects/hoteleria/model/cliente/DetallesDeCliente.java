package com.spring_boot_ariel_projects.hoteleria.model.cliente;

public record DetallesDeCliente(Long id,
                                String username,
                                String email,
                                String role) {
    public DetallesDeCliente(Cliente cliente){
        this(cliente.getId(), cliente.getUsername(), cliente.getEmail(), cliente.getRole());
    }
}
