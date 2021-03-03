package ru.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "announcements")
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "car_id", foreignKey = @ForeignKey(name = "CAR_ID_FK"))
    private Car car;

    @ManyToOne
    @JoinColumn(name = "seller_id", foreignKey = @ForeignKey(name = "SELLER_ID_FK"))
    private Seller seller;
    private int price;
    private String description;
    boolean status;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Photo> photos = new ArrayList<>();

    public static Announcement of(Car car, Seller seller, int price, String description, boolean status)  {
        Announcement announcement = new Announcement();
        announcement.car = car;
        announcement.description = description;
        announcement.price = price;
        announcement.seller = seller;
        announcement.status = status;
        return announcement;
    }

    public static Announcement of(Car car, Seller seller, int price, String description, boolean status, List<Photo> photos)  {
        Announcement announcement = new Announcement();
        announcement.car = car;
        announcement.description = description;
        announcement.price = price;
        announcement.seller = seller;
        announcement.status = status;
        announcement.photos = photos;
        return announcement;
    }

    public Announcement() {
    }

    public Announcement(int id, Car car, Seller seller, int price, String description, boolean status) {
        this.id = id;
        this.car = car;
        this.seller = seller;
        this.price = price;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
