create table pago(
    id bigint not null auto_increment,
    monto bigint not null,
    metodo_pago varchar(20) not null,
    estado varchar(20) not null,
    fecha_pago date not null,
    reserva_id bigint not null,
    primary key(id),

    constraint fk_reserva_id foreign key (reserva_id) references reserva(id)
);