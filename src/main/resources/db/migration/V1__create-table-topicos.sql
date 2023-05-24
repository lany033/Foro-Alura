create table topicos(
    id bigint not null auto_increment,
    titulo varchar(200) not null,
    mensaje varchar(400) not null,
    fecha date,
    estatus varchar(200) not null,
    autor varchar(100) not null,
    curso varchar(100) not null,

    primary key(id)
);