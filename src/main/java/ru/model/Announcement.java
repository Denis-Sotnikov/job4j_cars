package ru.model;

import javax.persistence.*;

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
}
