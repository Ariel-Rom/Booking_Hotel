package com.spring_boot_ariel_projects.hoteleria.model.pago;

import java.time.LocalDate;

public record DetallesDelPago(Long monto,
                              String metodo_pago,
                              String estado,
                              LocalDate fecha_pago,
                              Long reserva_id) {
    public DetallesDelPago(Pago pago){
        this(   pago.getMonto(),
                pago.getMetodo_pago(),
                pago.getEstado(),
                pago.getFecha_pago(),
                pago.getReserva_id());
    }
}
