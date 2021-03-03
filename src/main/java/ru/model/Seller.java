package ru.model;

import javax.persistence.*;

@Entity
@Table(name = "sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telephonNumber;

    public static Seller of(String name, String telephonNumber)  {
        Seller seller = new Seller();
        seller.name = name;
        seller.telephonNumber = telephonNumber;
        return seller;
    }

    public Seller() {
    }

    public Seller(int id, String name, String telephonNumber) {
        this.id = id;
        this.name = name;
        this.telephonNumber = telephonNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephonNumber() {
        return telephonNumber;
    }

    public void setTelephonNumber(String telephonNumber) {
        this.telephonNumber = telephonNumber;
    }


}
