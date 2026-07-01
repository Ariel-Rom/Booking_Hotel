create table reserva(
    id bigint not null auto_increment,
    dia_ingreso date not null,
    dia_egreso date not null,
    precio_total bigint not null,
    created_at date,
    habitacion_id bigint not null,
    user_id bigint not null ,
    primary key (id),

    constraint fk_habitacion_id foreign key (habitacion_id) references habitacion(id),
    constraint fk_user_id foreign key (user_id) references cliente(id)
);