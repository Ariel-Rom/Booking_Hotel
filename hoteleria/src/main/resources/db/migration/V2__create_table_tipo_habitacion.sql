create table tipo_habitacion(
    id bigint not null auto_increment,
    nombre varchar(20),
    precio_base bigint not null,
    capacidad bigint not null,
    primary key (id)
);