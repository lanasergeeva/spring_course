package com.lana.hiber;

import com.lana.hiber.entity.Detail;
import com.lana.hiber.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbmTestOtOUni {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Tim", "Lanenko", "IT", 50000);
            Detail detail1 = new Detail("Mias", "89998899888", "tim@mail.ru");
            emp.setDetails(detail1);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        }
    }
}
