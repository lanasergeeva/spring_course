package com.lana.hiber.hbmtest;

import com.lana.hiber.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbmTest {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Tim", "Lanenko", "IT", 50000);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        }
    }
}
