package ru.model;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;


public class HbmRun {
    public static void main(String[] args) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure().build();
        try {
            SessionFactory sf = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sf.openSession();
            session.beginTransaction();

            Photo firstPhoto = Photo.of("first");
            Photo secondPhoto = Photo.of("second");
            List<Photo> photoList = new ArrayList<>();
            photoList.add(firstPhoto);
            photoList.add(secondPhoto);
            Seller seller = Seller.of("Dmitry", "8888888");
            Car car = Car.of("bmv", "x5", "universal", "1", 2010, "red");
            Car carsecond = Car.of("mercedes", "cls", "universal", "1", 2010, "red");
            Announcement one = Announcement.of(car, seller, 100, "Tachka", true);
            session.save(seller);
            session.save(car);
            one.getPhotos().add(firstPhoto);
            one.getPhotos().add(secondPhoto);
            session.save(one);
            session.save(carsecond);

            Announcement second = Announcement.of(carsecond, seller, 100, "Tachka", true);
            session.save(second);

            session.getTransaction().commit();
            session.close();
        }  catch (Exception e) {
            e.printStackTrace();
        } finally {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}