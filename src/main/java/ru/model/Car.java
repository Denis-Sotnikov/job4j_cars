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
    private int yearOfCarManufacture;
    private String color;

    public static Car of(String bmv, String marka, String model, String bodyType, int yearOfCarManufacture, String color)  {
        Car car = new Car();
        car.marka = marka;
        car.model = model;
        car.bodyType = bodyType;
        car.color = color;
        car.yearOfCarManufacture = yearOfCarManufacture;
        return car;
    }

    public Car() {
    }

    public Car(int id, String marka, String model, String bodyType, int yearOfCarManufacture, String color) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.bodyType = bodyType;
        this.yearOfCarManufacture = yearOfCarManufacture;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getYearOfCarManufacture() {
        return yearOfCarManufacture;
    }

    public void setYearOfCarManufacture(int yearOfCarManufacture) {
        this.yearOfCarManufacture = yearOfCarManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
