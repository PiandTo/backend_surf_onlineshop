DROP SCHEMA if exists backendshop cascade ;

CREATE SCHEMA backendshop;

CREATE TABLE backendshop.product (
    id int primary key,
    name varchar(50),
    type varchar(50),
    price int,
    new_product bool,
    hot_product bool,
    old_price int,
    image text,
    description text
);