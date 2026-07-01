package com.spring_boot_ariel_projects.hoteleria.model.habitacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity(name = "Habitacion")
@Table(name = "habitacion")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Habitacion {

    @Id
    private Long id;
    @Column(nullable = false)
    private Long numero;
    @Column(nullable = false)
    private Long tipo_habitacion_id;
    @Column(nullable = false)
    private Long hotel_id;

}
