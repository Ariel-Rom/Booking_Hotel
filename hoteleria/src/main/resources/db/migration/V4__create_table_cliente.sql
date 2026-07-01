create table cliente(
    id bigint not null auto_increment,
    username varchar(20) not null,
    email varchar(30) unique not null,
    password varchar(255) not null,
    role varchar(20) not null,
    created_at date not null,
    primary key(id)
);