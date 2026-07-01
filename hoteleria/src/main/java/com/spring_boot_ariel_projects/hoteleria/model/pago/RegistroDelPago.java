package com.spring_boot_ariel_projects.hoteleria.model.pago;

import java.time.LocalDate;

public record RegistroDelPago(Long monto,
                              String metodo_pago,
                              String estado,
                              LocalDate fecha_pago,
                              Long reserva_id) {
}
