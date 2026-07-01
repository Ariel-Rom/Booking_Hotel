package com.spring_boot_ariel_projects.hoteleria.model.habitacion;

public record DetallesDeHabitacion(Long id,
                                   Long numero,
                                   Long tipo_habitacion,
                                   Long hotel_id) {
    public DetallesDeHabitacion(Habitacion habitacion){
        this(   habitacion.getId(),
                habitacion.getNumero(),
                habitacion.getTipo_habitacion_id(),
                habitacion.getHotel_id());
    }
}
