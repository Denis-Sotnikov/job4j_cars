create table cars (
  id serial primary key,
  color varchar,
  name varchar,
  yearOfCarManufacture int
);

create table announcements (
    id serial primary key,
    price int,
    description varchar,
    car_id int not null unique references cars(id),
    seller_id int not null references sellers(id)
);

create table sellers (
  id serial primary key,
  name varchar,
  telephonNumber varchar
);
