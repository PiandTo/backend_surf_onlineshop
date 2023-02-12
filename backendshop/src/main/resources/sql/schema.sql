DROP SCHEMA if exists backendshop cascade ;

CREATE SCHEMA backendshop;

CREATE TABLE backendshop.product (
    id int primary key,
    name varchar(50),
    type varchar(50),
    price int,
    is_selected bool,
    image text,
    description text
);