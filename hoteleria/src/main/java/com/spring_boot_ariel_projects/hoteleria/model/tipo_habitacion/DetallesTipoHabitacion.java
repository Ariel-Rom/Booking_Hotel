package com.spring_boot_ariel_projects.hoteleria.model.tipo_habitacion;

public record DetallesTipoHabitacion(String nombre,
                                     Long precio_base,
                                     Long capacidad) {
    public DetallesTipoHabitacion(TipoHabitacion tipoHabitacion){
        this(   tipoHabitacion.getNombre(),
                tipoHabitacion.getPrecio_base(),
                tipoHabitacion.getCapacidad());
    }
}
