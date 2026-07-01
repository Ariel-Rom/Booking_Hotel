package com.spring_boot_ariel_projects.hoteleria.model.hotel;

public record DetallesDelHotel( String nombre,
                               Long calificaciones,
                               String desayuno_incluido) {
    public DetallesDelHotel(Hotel hotel){
        this(   hotel.getNombre(),
                hotel.getCalificaciones(),
                hotel.getDesayuno_incluido());
    }
}
