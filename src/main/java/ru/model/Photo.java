package ru.model;

import javax.persistence.*;

@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public static Photo of(String name)  {
        Photo photo = new Photo();
        photo.name = name;
        return photo;
    }

    public Photo() {
    }

    public Photo(int id) {
        this.id = id;
    }

    public Photo(String name) {
        this.name = name;
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
}
