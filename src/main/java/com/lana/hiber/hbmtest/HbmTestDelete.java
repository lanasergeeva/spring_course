package com.lana.hiber.hbmtest;

import com.lana.hiber.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbmTestDelete {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
        /*    Employee emp = session.get(Employee.class, 3);
            session.delete(emp);*/
            session.createQuery("delete EmployeeT "
                    + "where id between 1 and 2").executeUpdate();
            session.getTransaction().commit();
        }
    }
}
