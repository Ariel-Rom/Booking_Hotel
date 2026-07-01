package com.spring_boot_ariel_projects.hoteleria.model.reserva;

import java.time.LocalDate;

public record RegistroReserva(Long habitacion_id,
                              Long user_id,
                              LocalDate dia_ingreso,
                              LocalDate dia_egreso,
                              Long precio_total) {
}
