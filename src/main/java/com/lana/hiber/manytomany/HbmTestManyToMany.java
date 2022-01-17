package com.lana.hiber.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbmTestManyToMany {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Child c1 = new Child(5, "Masha");
            Child c2 = new Child(4, "Ivan");
            Child c3 = new Child(5, "Mark");
            Child c4 = new Child(7, "Tina");
            Child c5 = new Child(6, "Pasha");
            Section s1 = new Section("Dance Club");
            Section s2 = new Section("English Club");
            Section s3 = new Section("Music School");
            s1.addChildToSections(c1);
            s1.addChildToSections(c3);
            s1.addChildToSections(c5);
            s2.addChildToSections(c1);
            s2.addChildToSections(c4);
            s2.addChildToSections(c2);
            s3.addChildToSections(c5);
            s3.addChildToSections(c1);
            session.save(s1);
            session.save(s2);
            session.save(s3);

          /*  select s.name, c.name, c.id from children c
            join children_sections cs
            on cs.children_id=c.id
            join sections s
            on cs.sections_id=s.id;*/
            session.getTransaction().commit();
        }
    }
}
