package ru.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marka;
    private String model;
    private String bodyType;
    private String photoId;
    private int yearOfCarManufacture;
    private String color;
}
