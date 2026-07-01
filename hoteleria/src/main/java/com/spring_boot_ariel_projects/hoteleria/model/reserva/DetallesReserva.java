package com.spring_boot_ariel_projects.hoteleria.model.reserva;

import java.time.LocalDate;

public record DetallesReserva(Long habitacion_id,
                              Long user_id,
                              LocalDate dia_ingreso,
                              LocalDate dia_egreso,
                              Long precio_total) {
    public DetallesReserva(Reserva reserva){
        this(
                reserva.getHabitacion_id(),
                reserva.getUser_id(),
                reserva.getDia_ingreso(),
                reserva.getDia_egreso(),
                reserva.getPrecio_total());
    }
}
