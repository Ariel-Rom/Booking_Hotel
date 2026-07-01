create table habitacion(
    id bigint not null auto_increment,
    numero bigint not null,
    tipo_habitacion_id bigint not null,
    hotel_id bigint not null,
    primary key (id),

    constraint uq_hotel_numero unique (hotel_id, numero),
    constraint fk_habitacion_tipo foreign key (tipo_habitacion_id) references tipo_habitacion(id),
    constraint fk_habitacion_hotel foreign key (hotel_id) references hotel(id)
);