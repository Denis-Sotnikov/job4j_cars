create table cars (
  id serial primary key,
  marka text,
  model text,
  bodytype text,
  color text,
  yearOfCarManufacture int
);

CREATE TABLE photo (
    id SERIAL PRIMARY KEY,
    name text
);

create table announcements (
    id serial primary key,
    price int,
    description text,
    status boolean,
    car_id int not null unique references cars(id),
    seller_id int not null references sellers(id)
);

create table sellers (
  id serial primary key,
  name text,
  telephonNumber text
);

create table users (
  id serial primary key,
  name text,
  email text,
  password text
);


