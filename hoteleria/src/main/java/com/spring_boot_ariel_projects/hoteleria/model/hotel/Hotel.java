package com.spring_boot_ariel_projects.hoteleria.model.hotel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity(name = "Hotel")
@Table(name = "hotel")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    private Long calificaciones;
    private String desayuno_incluido;

    public Hotel(RegistroDeDatosDelHotel datos_registro) {
        this.nombre = datos_registro.nombre();
        this.calificaciones = datos_registro.calificaciones();
        this.desayuno_incluido = datos_registro.desayuno_incluido();
    }
}
