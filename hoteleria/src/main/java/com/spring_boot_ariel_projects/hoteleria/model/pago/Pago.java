package com.spring_boot_ariel_projects.hoteleria.model.pago;

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
@Entity(name = "Pago")
@Table(name = "pago")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pago {

    @Id
    private Long id;
    @Column(nullable = false)
    private Long monto;
    @Column(nullable = false)
    private String metodo_pago;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private LocalDate fecha_pago;
    @Column(nullable = false)
    private Long reserva_id;

}
