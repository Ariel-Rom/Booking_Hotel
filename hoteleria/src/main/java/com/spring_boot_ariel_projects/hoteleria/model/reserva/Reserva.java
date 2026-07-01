package com.spring_boot_ariel_projects.hoteleria.model.reserva;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@Entity(name = "Reserva")
@Table(name = "reserva")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Reserva {

    @Id
    private Long id;
    @Column(nullable = false)
    private Long habitacion_id;
    @Column(nullable = false)
    private Long user_id;
    @Column(nullable = false)
    private LocalDate dia_ingreso;
    @Column(nullable = false)
    private LocalDate dia_egreso;
    @Column(nullable = false)
    private Long precio_total;
    private LocalDate created_at;

}
