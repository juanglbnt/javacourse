create table director(
    id integer not null primary key,
    name varchar (50) not null
);

create table film(
    id integer not null primary key,
    name varchar (50) not null,
    year integer,
    director_id integer,
    foreign key (director_id) references director(id)
);